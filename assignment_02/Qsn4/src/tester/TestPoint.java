package tester;

import java.util.Scanner;
import com.app.geometry.Point2D;

public class TestPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter coordinates for Point 1 (x y): ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.println("Enter coordinates for Point 2 (x y): ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        Point2D p1 = new Point2D(x1, y1);
        Point2D p2 = new Point2D(x2, y2);

        System.out.println("Point 1 details: " + p1.getDetails());
        System.out.println("Point 2 details: " + p2.getDetails());

        if (p1.isEqual(p2)) {
            System.out.println("Point 1 and Point 2 are located at the same position.");
        } else {
            double distance = p1.calculateDistance(p2);
            System.out.println("Point 1 and Point 2 are located at different positions.");
            System.out.println("Distance between Point 1 and Point 2: " + distance);
        }

        sc.close();
    }
}

