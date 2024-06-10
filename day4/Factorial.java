import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Calculate the factorial recursively
        long factorial = calculateFactorial(number);

        // Print the result
        System.out.println("The factorial of " + number + " is: " + factorial);

        // Close the scanner
        scanner.close();
    }

    // Method to calculate factorial recursively
    public static long calculateFactorial(int n) {
        if (n == 0) {
            return 1; // Base case: 0! is 1
        } else {
            return n * calculateFactorial(n - 1); // Recursive case
        }
    }
}
