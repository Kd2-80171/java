package payrollCalculation;

public class BasePlusComissionEmployee extends Employee{
	
	double grossSales,commissionRate,baseSalary;
	
	@Override
	public double earnings()
	{
		double bonus=(baseSalary/10);
		return baseSalary+((commissionRate/100)*grossSales)+bonus;
	}
	@Override
	public void acceptData()
	{
		super.acceptData();
		System.out.println("Enter Base Salary : ");
		baseSalary=in.nextDouble();
		
		System.out.println("Enter GrossSales : ");
		this.grossSales=in.nextDouble();
		
		System.out.println("Enter CommissionRate : ");
		this.commissionRate=in.nextDouble();
	}
	@Override
	public String toString() {
		return "BasePlusComissionEmployee ["+super.toString()+" grossSales=" + this.grossSales + ", commissionRate=" + commissionRate
				+ ", baseSalary=" + baseSalary+"]";
	}

}
