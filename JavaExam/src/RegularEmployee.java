import java.util.Date;

class RegularEmployee extends Employee
{

	public RegularEmployee(String firstName, String lastName, int age,
			int monthlySalary, Date dateOfBirth) {
		super(firstName, lastName, age, monthlySalary, dateOfBirth);
	}

	@Override
	public int calculateYearlySalary() {
		return super.calculateYearlySalary();
	}
	
}