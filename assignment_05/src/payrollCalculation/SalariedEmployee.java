package payrollCalculation;

public class SalariedEmployee extends Employee{
	
	double weeklySalary;
	
	@Override
	public double earnings()
	{
		return weeklySalary;
	}
	
	@Override
	public void acceptData()
	{
		super.acceptData();
		System.out.println("Enter Weekly Salary of Salaried Employee : ");
		this.weeklySalary=in.nextDouble();
	}
	
	@Override
	public String toString()
	{
		return super.toString()+"\nWeekly Salary : "+this.weeklySalary;
	}
}
