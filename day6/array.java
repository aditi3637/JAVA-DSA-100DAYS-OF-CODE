import java.util.Arrays;
import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println(arr[0]);
        arr[0] = 90;
        arr[1] = 9035;
        arr[2] = 3535;
        arr[3] = 935;
        arr[4] = 924;
        System.out.println(arr[4]);
        // Input elements into the array
        System.out.print("Enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            arr[i] = in.nextInt();
        }

        // Print elements of the array
        System.out.print("The array elements are:");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i]);
        }
        // array of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length ; i++) {
            str[i] = in.next();
        }
        System.out.print(Arrays.toString(str));

    }
}
