import java.util.Date;

class Manager extends Employee {

	int yearlyBonus;
	public Manager(String firstName, String lastName, int age,
			int monthlySalary, Date dateOfBirth, int yearlyBonus) {
		super(firstName, lastName, age, monthlySalary, dateOfBirth);
		this.yearlyBonus = yearlyBonus;
	}
	@Override
	public int calculateYearlySalary() {
		yearlySalary = (12*monthlySalary)+yearlyBonus;
		return yearlySalary;
	}
	
}