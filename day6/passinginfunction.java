import java.util.Arrays;
import java.util.Scanner;
public class passinginfunction {
    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr){
        arr[0] = 90;

    }
}
