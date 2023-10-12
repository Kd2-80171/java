package payrollCalculation;

public class HourlyEmployee extends Employee {

	double hourlyWage;
	int hoursWorked;

	@Override
	public double earnings() {
		if (this.hoursWorked <= 40) {
			return (this.hourlyWage * this.hoursWorked);
		} else {
			return ((this.hoursWorked - 40) * (1.5 * this.hourlyWage)) + (40 * this.hourlyWage);
		}
	}

	@Override
	public void acceptData() {
		super.acceptData();
		System.out.println("Enter Hourly Wage of Employee : ");
		this.hourlyWage = in.nextDouble();

		System.out.println("Enter Hours Worked of hourly Employee : ");
		this.hoursWorked = in.nextInt();
	}
	
	@Override
	public String toString()
	{
		return super.toString()+"\nHourly Wage : "+this.hourlyWage+"\nHourly Worked : "+this.hoursWorked;
	}
}
