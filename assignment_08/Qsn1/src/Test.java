
public class Test {

	
	public static void main(String [] ergs) {
//		Employee emp = new Employee();
//		emp.accept();
//		emp.display();
		
		
		
//		SalesManager sals = new SalesManager();
//		sals.accept();
//		sals.display();
		
		Box <Employee> b1 = new Box <>();
//		b1.set(emp);
//		b1.get();
//		
		//System.out.println(b1.getTotalSal());
		
		Manager man = new Manager();
		man.accept();
		man.display();
		
		b1.set(man);
		b1.get();
		
		System.out.println(b1.getTotalSal());
		
	}
	
}
