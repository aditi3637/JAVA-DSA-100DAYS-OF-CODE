import java.util.Scanner;
public class CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//
//        // Loop to allow multiple calculations
//        while (true) {
//            System.out.print("Enter the radius of the circle (or enter 0 to exit): ");
//            double radius = scanner.nextDouble();
//
//            // Exit condition
//            if (radius == 0) {
//                break;
//            }
//
//            // Calculate the area
//            double area = Math.PI * radius * radius;
//
//            // Display the result
//            System.out.println("The area of the circle with radius " + radius + " is " + area);
//        }
//
//        System.out.println("Program exited.");
//        scanner.close();
        double radius = scanner.nextDouble();
        System.out.println("enter the radius : ");

        double area = Math.PI * Math.pow(radius,2);
        System.out.println( area);
    }
}

