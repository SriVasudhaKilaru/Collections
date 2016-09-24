import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeUtility {
		public List<Employee> sortEmployeesBySalary(List<Employee> list)
		{
			Collections.sort(list, new Comparator<Employee>(){
		
				@Override
				public int compare(Employee e1, Employee e2) {
					if(e1.calculateYearlySalary()>e2.calculateYearlySalary())
						return 1;
					else if(e1.calculateYearlySalary()<e2.calculateYearlySalary())
						return -1;
					else
						return 0;
				}
				
			});
			return list;
		}
		public List<Employee> sortEmployeesByAge(List<Employee> list)
		{
			Collections.sort(list, new Comparator<Employee>(){
				
				@Override
				public int compare(Employee e1, Employee e2) {
					return e1.age - e2.age;
				}
				
			});
			return list;
		}
		public Map<Employee,Integer> groupEmployees(List<Employee> list)
		{
			Map<Employee,Integer> map = new HashMap<Employee,Integer>();
			for(Employee e:list)
			{
				if(map.containsKey(e))
					map.put(e, map.get(e)+1);
				else
					map.put(e, 1);
			}
			return map;
		}
		public void print(List<Employee> list){
			for(Employee e:list)
				System.out.println(e.firstName+" "+e.lastName+" "+e.age+" "+e.monthlySalary+" "+e.calculateYearlySalary());
		}
		public static void main(String[] args)
		{
			List<Employee> list = new ArrayList<Employee>();
			try {
				list.add(new Employee("tom","jerry",20,20000,new SimpleDateFormat("MM/dd/yyyy").parse("08/11/1992")));
				list.add(new Employee("tom","jerry",20,20000,new SimpleDateFormat("MM/dd/yyyy").parse("08/11/1992")));
				list.add(new Employee("bard","cruise",30,80000,new SimpleDateFormat("MM/dd/yyyy").parse("03/04/1984")));
				list.add(new Employee("agent","hanks",40,60000,new SimpleDateFormat("MM/dd/yyyy").parse("04/12/1983")));
				list.add(new Employee("egen","hardy",60,50000,new SimpleDateFormat("MM/dd/yyyy").parse("09/15/1987")));
				list.add(new Employee("jarkins","ford",80,30000,new SimpleDateFormat("MM/dd/yyyy").parse("08/21/1982")));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			EmployeeUtility e = new EmployeeUtility();
			System.out.println("Sort by Salary");
			System.out.println("-----------------------");
			e.print(e.sortEmployeesBySalary(list));
			
			
			System.out.println();
			System.out.println("Sort by Age");
			System.out.println("-----------------------");
			e.print(e.sortEmployeesByAge(list));
			
			System.out.println();
			for(Map.Entry<Employee,Integer> entry:((Map<Employee, Integer>) e.groupEmployees(list)).entrySet())
			{
				Employee emp = entry.getKey();
				System.out.println(emp.firstName+" "+emp.lastName+" "+emp.age+" "+emp.monthlySalary+" "+emp.calculateYearlySalary()+" No of occurrences of this object of type Employee :"+ entry.getValue());
			}
			
		}
}
