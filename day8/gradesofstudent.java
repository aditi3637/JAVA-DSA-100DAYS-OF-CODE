//Write a program to print the grades of 3 students based on
// the marks they have obtained provided as input.
// The student is graded A if marks are greater than 90,
// B if marks are greater than 70,
// C if greater than or equal to 40, else F.
import java.util.Scanner;
public class gradesofstudent {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int grade1;
        grade1 = in.nextInt();
        if (grade1 > 90) {
            System.out.println("A");
        } else if (grade1 <= 40) {
            System.out.println("C");
        } else {
            System.out.println("F");
        }
        int grade2;
        grade2 = in.nextInt(); // input second number
        if (grade2 > 90) {
            System.out.println("A");
        } else if (grade2 >= 0) {
            System.out.println("C");
        } else {
            System.out.println("F");
        }
        int grade3;
        grade3 = in.nextInt(); // input third number
        if (grade3 > 90) {
            System.out.println("A");
        } else if (grade3 > 40) {
            System.out.println("C");
        } else {
            System.out.println("F");
        }



    }
}
