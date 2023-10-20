package sunbeam.qsn3;

import java.util.Scanner;

public class ArithmaticMain {
	
	static void calculte(double num1 , double num2 , Aritmatic op) {
    double result = op.calc(num1, num2);
    System.out.println("Result  :" + result);
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double num1 ,num2 ;
		int choice;
		
		System.out.println("enter the first number");
		num1 = sc.nextDouble();
		
		System.out.println("enetr the second number");
		num2 =sc.nextDouble();
	
	

	do 
	
	{
		System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("0. Exit");
        choice = sc.nextInt();
        
        switch(choice)
        {
        case 1:
        	calculte(num1,num2, (a,b) -> a + b);
        	break;
        case 2:
        	calculte(num1,num2,(a,b) ->a-b);
        	break;
        case 3:
        	calculte(num1,num2,(a,b) -> a*b);
        	break;
        case 4:
        	calculte(num1,num2,(a,b) -> a/b);
        	break;
        default:
        	System.out.println("Invalid choice");
        	break;
        	
        }
       
		
          } while (choice !=0);
	
}

}
