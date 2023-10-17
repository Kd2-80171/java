import java.util.Scanner;

public class SalesManager extends Manager{

	
	private float comm;

	public SalesManager()
	    {
	        
	    }

	
	@Override
	void display() {
		
		super.display();
		System.out.println("comm is =" + this.comm);
	}
	
public SalesManager(int id, float sal, float bonus, float comm) {
	super(id, sal, bonus);
	this.comm = comm;
}


	@Override
	void accept() {
		
		super.accept();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enetr the comm: ");
		comm = sc.nextFloat();
	}

	@Override
	public double getTotalSalary() {
		
		return super.getTotalSalary()+comm *12;
		
	}
	
	  
	  
//	public  void displaySalesman()
//	    {
//	        System.out.println("Commission is : " +this. comm );
//	        ;
//	    }
//	    void acceptSalesman()
//	    {
//	        System.out.println("Enter Commission : " + this.comm);
//	        
//	    }
	
}
