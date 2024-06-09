import java.util.Scanner;

public class Sumofnumbers {
    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the value of N
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        // Initialize the sum to 0
        int sum = 0;

        // Calculate the sum of the first N numbers
        for (int i = 1; i <= N; i++) {
            sum += i;
        }

        // Print the result
        System.out.println("The sum of the first " + N + " numbers is: " + sum);

        // Close the scanner
        scanner.close();
    }
}

