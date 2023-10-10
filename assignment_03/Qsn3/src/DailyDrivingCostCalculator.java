


	import java.util.Scanner;

	public class DailyDrivingCostCalculator {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter total miles driven per day: ");
	        double totalMilesDriven = scanner.nextDouble();

	        System.out.print("Enter cost per gallon of gasoline: ");
	        double costPerGallon = scanner.nextDouble();

	        System.out.print("Enter average miles per gallon: ");
	        double averageMilesPerGallon = scanner.nextDouble();

	        System.out.print("Enter parking fees per day: ");
	        double parkingFeesPerDay = scanner.nextDouble();

	        System.out.print("Enter tolls per day: ");
	        double tollsPerDay = scanner.nextDouble();

	        double dailyCost = (totalMilesDriven / averageMilesPerGallon) * costPerGallon + parkingFeesPerDay + tollsPerDay;

	        System.out.println("Your daily driving cost is: $" + dailyCost);

	        scanner.close();
	    }
	}

}
