import java.util.Date;

class CTOEmployee extends Employee {

	int yearlyBonus, incentiveBonus;
	public CTOEmployee(String firstName, String lastName, int age,
			int monthlySalary, Date dateOfBirth, int yearlyBonus, int incentiveBonus) {
		super(firstName, lastName, age, monthlySalary, dateOfBirth);
		this.yearlyBonus = yearlyBonus;
		this.incentiveBonus = incentiveBonus;
	}
	@Override
	public int calculateYearlySalary() {
		yearlySalary = (12*monthlySalary)+yearlyBonus+incentiveBonus;
		return yearlySalary;
	}
}