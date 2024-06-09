import java.util.Scanner;
public class nested {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

        switch (empID) {
            case 1 -> System.out.println("aditi");
            case 2 -> System.out.println("web");
            case 3 -> {
                System.out.println("emp no 3");
                switch (department) {
                    case "IT" -> System.out.println("it");
                    case "CSE" -> System.out.println("CSE");
                    default -> System.out.println("anything");
                }
            }
            default -> System.out.println("nothing");
        }
    }
}
