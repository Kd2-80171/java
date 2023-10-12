package payrollCalculation;

import java.util.Scanner;

abstract public class Employee {
	private String firstName,lastName;
	int SSN;
	
	static Scanner in=new Scanner(System.in);
	
	
	public void acceptData() {
		System.out.println("Enter First Name of Employee : ");
		firstName=in.next();
		
		System.out.println("Enter Last Name of Employee : ");
		lastName=in.next();
		
		System.out.println("Enter Social Security Number : ");
		SSN=in.nextInt();
	}
	
	abstract public double earnings();
	
	@Override
	public String toString()
	{
		return "FirstName : "+this.firstName+"\nLast Name : "+this.lastName+"\nSSN : "+this.SSN;
	}
}
