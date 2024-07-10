import java.util.Arrays;
public class searchingin2darray {
    public static void main(String[] args) {
//        int target = 62;
        int[][] arr =new int[][]{
                {2, 3, 6},
                {5, 62, 785},
                {41, 58, 86},
                {15, 17}
        };
        int target = 62;
        int[]  ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
            static int[] search(int[][] arr, int target){
                for (int row = 0; row < arr.length ; row++) {
                    for (int col = 0; col < arr[row].length ; col++) {
                        if (arr[row][col] == target){
                            return new int[]{row,col};
                        }

                    }

                }
                return new int[]{-1,-1};
            }

        }


