import java.util.Comparator;
import java.util.Date;

class Employee{
	String firstName;
	String lastName;
	int age;
	int monthlySalary;
	Date dateOfBirth;
	int yearlySalary;

	public Employee(String firstName, String lastName, int age,
			int monthlySalary, Date dateOfBirth) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.monthlySalary = monthlySalary;
		this.dateOfBirth = dateOfBirth;
	}

	public int calculateYearlySalary() {
		yearlySalary = 12 * monthlySalary;
		return yearlySalary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
		result = prime * result
				+ ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result
				+ ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (dateOfBirth == null) {
			if (other.dateOfBirth != null)
				return false;
		} else if (!dateOfBirth.equals(other.dateOfBirth))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}

	// Implementening natural order by calling comparator
	// collections.sort(Name, Employee.EmployeeComparator);
	public static Comparator<Employee> EmployeeComparator = new Comparator<Employee>() {

		public int compare(Employee e1, Employee e2) {

			// ascending order
			return e1.calculateYearlySalary()-e2.calculateYearlySalary();

			// descending order
			/*
			 * if(e1.calculateYearlySalary()>e2.calculateYearlySalary()) return
			 * -1; else
			 * if(e1.calculateYearlySalary()<e2.calculateYearlySalary()) return
			 * 1; else return 0;
			 */
		}

	};
}
