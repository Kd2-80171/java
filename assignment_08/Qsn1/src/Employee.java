import java.util.Scanner;

public class Employee{
    
    	
    		   private  int id;
    		    private float sal;

    		
    		     public  Employee()
    		    {
    		       
    		       
    		    }
    		    public  Employee(int id, float sal)
    		    {
    		        this.id = id;
    		        this.sal = sal;
    		    }


    		    public int getId() {
					return id;
				}
				public void setId(int id) {
					this.id = id;
				}
				public float getSal() {
					return sal;
				}
				public void setSal(float sal) {
					this.sal = sal;
				}
				void display()
    		    {
    		        System.out.println("Employee id : " + this.id);
    		       System.out.println ( "Employee salary : " + this.sal);
    		    }

    		    void accept()
    		    { 
    		       Scanner sc = new Scanner(System.in);
                     
    		       System.out.println("Enter Employee id : " );
    		            id = sc.nextInt();
    		         
    		        
    		        System.out.println("Enter Employee salary : " );
    		                   sal = sc.nextFloat();    
    		    } 
    		     public double getTotalSalary() {
    		    	
    		    	 return  this.sal * 12;
    		     }
    		    
    		
    	}
	
    
