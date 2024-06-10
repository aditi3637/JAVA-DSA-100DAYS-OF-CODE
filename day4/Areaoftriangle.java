import java.util.Scanner;

public class Areaoftriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the base of the triangle
        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();

        // Prompt the user to enter the height of the triangle
        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();

        // Calculate the area of the triangle
        double area = 0.5 * base * height;

        // Display the result
        System.out.println("The area of the triangle with base " + base + " and height " + height + " is " + area);

        scanner.close();
    }
}

