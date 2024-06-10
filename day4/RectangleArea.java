import java.util.Scanner;
public class RectangleArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter the length: ");
        double length = in.nextDouble();

        System.out.println("enter the bredth: ");
        double bredth = in.nextDouble();

        double area = length * bredth ;
        System.out.println(area);


    }
}
