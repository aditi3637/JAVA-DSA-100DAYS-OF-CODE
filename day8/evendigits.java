//question is to find no. of those no. which has even digits
public class evendigits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 3, 6, 7896};
        System.out.println(findNumber(nums));

    }
    static int findNumber(int[] nums){
       int count = 0;
        for (int num:nums) {
            if (even(num)){
                count++;
            }
        }
        return count;
    }
    //function to check no. have even digit or not
     static boolean even(int num) {
        int numberofdigits = digits(num);
//         if (numberofdigits % 2 == 0){
//            return true;
//        }
//             return false;
         return numberofdigits % 2 == 0;
    }
    static int digits(int num){
        int count = 0;
        while (num > 0){
            count++;
            num = num / 10; //num of digits
        }

        return count;
    }
}
