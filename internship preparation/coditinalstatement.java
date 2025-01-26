import java.util.Scanner;

public class coditinalstatement {
    public static void main(String[] args) {
        int age = 32;
        if (age >= 18){
            System.out.println("vote, driving license");
        }
        else {
            System.out.println("not adult");
        }
        //print the larget number of two num
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b ){
            System.out.println(a + " is largest of 2");
        }
        else {
            System.out.println(b + " is largest of 2");
        }
        //print a num is even or odd
        int A = sc.nextInt();
        if ( A % 2 == 0){
            System.out.println(" A is even ");
        }
        else {
            System.out.println(" A IS ODD ");
        }
        //income tax calculator
        int income = sc.nextInt();
        if ( income < 500000){
            System.out.println(" 0 % tax ");
        } else if ( income > 500000 && income < 1000000) {
            System.out.println(" 20% tax");
        }else {
            System.out.println("tax = 30% ");
        }
        //print the largest of 3
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if (num1 > num2 && num1 >num3){
            System.out.println("num1 is greatest of three");
        } else if (num2 > num3) {
            System.out.println("num2 is greatest all of three");
        }else {
            System.out.println(" num3 is gratest all of three");
        }
// ternary operator
        //num is even or odd
        int number = sc.nextInt();
        String type = ((number % 2) == 0)? "even" : "odd";
        System.out.println(type);
        //Check if student will pass or fail
        int marks = sc.nextInt();
        String type1  = (marks >= 33)? "pass" : "fail";
        System.out.println(type1);
    }
}
