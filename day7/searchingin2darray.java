public class searchingin2darray {
    public static void main(String[] args) {
        int[][] arr = {
                {4, 45, 32},
                {12, 45, 12},
                {52, 85, 96}
        };
        int target = 32;
        System.out.println(search(arr, target));
    }

    static int search(int[] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] ==target])
                    return

            }

        }
        return target;
    }
}

