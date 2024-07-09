public class minnum {
    public static void main(String[] args) {
        int[] arr = {34,54,-6, 322,5445,2323,5665,2354};
        System.out.println(min(arr));
    }
    //arr.length ! = 0;
    //return the min value to array;
    static int min(int[] arr){
    int ans = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]<ans){
                ans = arr[i];
            }

        }
        return ans;
    }
}
