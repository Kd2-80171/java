import java.util.Scanner;

public class CreditLimitCalculator {

	public static void main (String [] ergs) {
		Scanner sc = new Scanner(System.in);
		
		int accountNumber;
		int beginingBalance;
		int totalCharges;
		int totalCredits;
		int creditLimit;
		
		System.out.println("enter account number");
		accountNumber = sc.nextInt();
		
		while(accountNumber != -1) {
			System.out.println("enter begining balance :");
			beginingBalance = sc.nextInt();
			System.out.println("enter total charges :");
			totalCharges = sc.nextInt();
			System.out.println("enter total creidts :");
			totalCredits = sc.nextInt();
			System.out.println("enter total creidts :");
			creditLimit = sc.nextInt();
			
			 int newBalance = beginingBalance + totalCharges - totalCredits;

	            System.out.println("Account number: " + accountNumber);
	            System.out.println("New balance: " + newBalance);

	            if (newBalance > creditLimit) {
	                System.out.println("Credit limit exceeded");
	            }

	            System.out.print("\nEnter account number (-1 to quit): ");
	            accountNumber = sc.nextInt();
	        }
		sc.close();
		}
	}
	

