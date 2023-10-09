package assignment.employee;

public class EMployeeTest {
	
	public static void main(String [] ergs) {
		
		Employee emp1 = new Employee("john" , "doe" , 5000.0);
		Employee emp2 = new Employee("alice" , "smith" , -2000.0);
		
		System.out.println("before raise =" + emp1.getyearlySalary());
		System.out.println("before raise ="+ emp2.getyearlySalary());
		
		     emp1.applyraise(10);
		     emp2.applyraise(10);
		
		     System.out.println("after raise =" + emp1.getyearlySalary());
			System.out.println("after raise ="+ emp2.getyearlySalary());
		
	}

}
