package payrollCalculation;

public class CommissionEmployee extends Employee{
	
	double grossSales,commissionRate;
	@Override
	public double earnings()
	{
		return (this.commissionRate/100)*this.grossSales;
	}
	
	@Override
	public void acceptData()
	{
		super.acceptData();
		System.out.println("Enter GrossSales : ");
		this.grossSales=in.nextDouble();
		
		System.out.println("Enter CommissionRate : ");
		this.commissionRate=in.nextDouble();
		
	}
	
	@Override
	public String toString()
	{
		return super.toString()+"\nGross Sales : "+this.grossSales+"\nComission Rate : "+this.commissionRate;
	}

}
