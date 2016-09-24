import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Set;
import java.util.TreeSet;

public class NaturalOrderUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Employee e1 = new Employee("tom","jerry",20,20000,new SimpleDateFormat("MM/dd/yyyy").parse("08/11/1992"));
			Employee e2 = new RegularEmployee("bard","cruise",30,80000,new SimpleDateFormat("MM/dd/yyyy").parse("03/04/1984"));
			Employee e3 = new Manager("agent","hanks",40,60000,new SimpleDateFormat("MM/dd/yyyy").parse("04/12/1983"),20000);
			Employee e4 = new CTOEmployee("egen","hardy",60,50000,new SimpleDateFormat("MM/dd/yyyy").parse("09/15/1987"),20000,10000);
			System.out.println("calculateYearlySalary is called from Employee Class "+e1.calculateYearlySalary());
			System.out.println("calculateYearlySalary is called from RegularEmployee Class "+e2.calculateYearlySalary());
			System.out.println("calculateYearlySalary is called from Manager Class "+e3.calculateYearlySalary());
			System.out.println("calculateYearlySalary is called from CTOEmployee Class "+e4.calculateYearlySalary());
			
			Set<Employee> set = new TreeSet<Employee>(Employee.EmployeeComparator);
			set.add(e1);
			set.add(e2);
			set.add(e3);
			set.add(e4);
			System.out.println();
			System.out.println("Sort by Employee Salary");
			System.out.println("----------------------------");
			for(Employee e:set){
				System.out.println(e.calculateYearlySalary());
			}
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
