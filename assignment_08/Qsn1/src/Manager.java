import java.util.Scanner;

public class Manager  extends Employee{
	
	 
	
	private float bonus;

	public Manager()
	    {
	        
	    }
//	     public Manager(float bonus ,int id ,float sal) 
//	    {
//	        this.bonus = bonus;
//	    }
	
	    float getBonus()
	    {
	        return this.bonus;
	    }
	    void setBonus(float bonus)
	    {

	        this.bonus = bonus;
	    }
	  

	public Manager(int id, float sal, float bonus) {
			super(id, sal);
			this.bonus = bonus;
		}
	
	@Override
		void display() {
		
			super.display();
			   System.out.println("Manager Bonus is: " + this.bonus);
		}
		@Override
		void accept() {
			
			super.accept();
			Scanner sc = new Scanner(System.in);
	    	
	        System.out.println("Enter Bonus for manager : " );
	    	bonus = sc.nextFloat();
		}

		@Override
		public double getTotalSalary() {
		
			
			return this.bonus*12 + super.getTotalSalary();
		}
		
	
//	    void accept()
//	    {
//	    	Scanner sc = new Scanner(System.in);
//	    	bonus = sc.nextFloat();
//	        System.out.println("Enter Bonus for manager : " + this.bonus);
//	        
//	    }
//	    void display()
//	    {
//	        System.out.println("Manager Bonus is: " + this.bonus);
//	    }
	

}
