public class ceiling {
    public static void main(String[] args) {
        int[] arr = {-3, -1, 0, 58, 225, 785};
        int target = 83;
        int ans = ceiling(arr, target);
        System.out.println(ans);
    }

    //return the index of smallest number i.e. greater than or equal to target
    //return -1 if target does not exist
    static int ceiling(int[] arr, int target) {
        if (target > arr[arr.length -1]){
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            //find the middle element
//            int mid = (start + end) / 2;
            //might be possible that start+end exceed from range of int
            int mid = start + (end - start) / 2;

            if ((target < arr[mid])) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return start;
    }
}