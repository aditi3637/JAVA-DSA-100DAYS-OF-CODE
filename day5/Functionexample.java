public class Functionexample {

    // This is the main method, the entry point of the program
    public static void main(String[] args) {
        // Calling a function that takes two integers and returns their sum
        int result = add(5, 3);
        System.out.println("The sum of 5 and 3 is: " + result);

        // Calling a function that prints a greeting message
        greet("Alice");
    }

    // This function takes two integers as parameters and returns their sum
    public static int add(int a, int b) {
        return a + b;
    }

    // This function takes a string as a parameter and prints a greeting message
    public static void greet(String name) {
        System.out.println("Hello, " + name + "! Welcome to the Java world.");
    }
}
