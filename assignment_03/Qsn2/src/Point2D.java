 

import java.util.Scanner;

public class Point2D {
    private double x;
    private double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String getDetails() {
        return "(" + x + ", " + y + ")";
    }

    public boolean isEqual(Point2D other) {
        return this.x == other.x && this.y == other.y;
    }

    public double calculateDistance(Point2D other) {
        double deltaX = this.x - other.x;
        double deltaY = this.y - other.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
}

public class TestPointArray1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of points to plot: ");
        int numPoints = sc.nextInt();

        Point2D[] points = new Point2D[numPoints];

        for (int i = 0; i < numPoints; i++) {
            System.out.print("Enter x and y coordinates for point " + i + ": ");
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            points[i] = new Point2D(x, y);
        }

        int choice;
        do {
            System.out.println("\nMenu Options:");
            System.out.println("1. Display details of a specific point");
            System.out.println("2. Display x, y coordinates of all points");
            System.out.println("3. Calculate distance between two points");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the index of the point: ");
                    int index = sc.nextInt();
                    if (index >= 0 && index < numPoints) {
                        System.out.println("Details of Point " + index + ": " + points[index].getDetails());
                    } else {
                        System.out.println("Invalid index, please retry!");
                    }
                    break;
                case 2:
                    System.out.println("Coordinates of all points:");
                    for (int i = 0; i < numPoints; i++) {
                        System.out.println("Point " + i + ": " + points[i].getDetails());
                    }
                    break;
                case 3:
                    System.out.print("Enter the index of the starting point: ");
                    int startIndex = sc.nextInt();
                    System.out.print("Enter the index of the ending point: ");
                    int endIndex = sc.nextInt();
                    if (startIndex >= 0 && startIndex < numPoints && endIndex >= 0 && endIndex < numPoints) {
                        double distance = points[startIndex].calculateDistance(points[endIndex]);
                        System.out.println("Distance between Point " + startIndex + " and Point " + endIndex + ": " + distance);
                    } else {
                        System.out.println("Invalid indices, please retry!");
                    }
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice, please retry!");
            }
        } while (choice != 4);

        sc.close();
    }
}

