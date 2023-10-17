
public class Box< T extends Employee> {
	
	private T obj;
	
	public void set(T val) {
		this.obj = val;
	}
	public T get () {
		return this.obj; 
	}
	public double getTotalSal() {
		return obj.getTotalSalary();
	}
	
	

	
	
}
