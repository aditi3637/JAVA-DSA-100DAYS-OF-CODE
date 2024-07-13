public class floor {
    public static void main(String[] args) {
        int[] arr = {2, 23, 34, 45, 56, 67, 78, 89};
        int target = 83;
        int ans = floor(arr, target);
        System.out.println(ans);
    }

    //return the index of gratest number i.e. smaller than or equal to target
    //return -1 if target does not exist
    static int floor(int[] arr, int target) {
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
        return end;
    }
}