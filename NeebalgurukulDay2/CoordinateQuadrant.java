//Write a program to accept a coordinate point in a XY coordinate system 
//and determine in which quadrant the coordinate point lies.

package NeebalgurukulDay2;

import java.util.Scanner;

public class CoordinateQuadrant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the x-coordinate: ");
        double x = scanner.nextDouble();

        System.out.print("Enter the y-coordinate: ");
        double y = scanner.nextDouble();

        if (x > 0 && y > 0) {
            System.out.println("Quadrant I");
        } else if (x < 0 && y > 0) {
            System.out.println("Quadrant II");
        } else if (x < 0 && y < 0) {
            System.out.println("Quadrant III");
        } else if (x > 0 && y < 0) {
            System.out.println("Quadrant IV");
        } else if (x == 0 && y != 0) {
            System.out.println("On the Y-axis");
        } else if (x != 0 && y == 0) {
            System.out.println("On the X-axis");
        } else {
            System.out.println("At the origin");
        }

        scanner.close();
    }
}