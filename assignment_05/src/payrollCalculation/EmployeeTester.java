package payrollCalculation;

public class EmployeeTester {

	public static void main(String[] args) {
		
		Employee emp1=new CommissionEmployee();
		emp1.acceptData();
		System.out.println(emp1.earnings());
	}

}
