import java.util.Arrays;

public class Varargs {
    public static void main(String[] args) {
        fun(2,3,4,5,5,3,2,56,7,98);


    }
    static void fun(int...v){
        System.out.println(Arrays.toString(v));
    }
}
