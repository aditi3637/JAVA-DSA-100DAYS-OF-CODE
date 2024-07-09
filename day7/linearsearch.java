import java.util.Scanner;
public class linearsearch {
    public static void main(String[] args) {
       int [] nums ={325,23,45,657,687,65,34,43,90};
       int target = 657;
       int ans = linearSearch(nums,target);
        System.out.println(ans);
    }

    // search in the array: return the index if item found
//otherwise if item not fond return -1
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        //run a for loop
        for (int index = 0; index < arr.length; index++) {
            //check element at every index if it is = target
            int element = arr[index];
            if (element == target) {
                return index;
            }

        }
// this line will be execute if none of above have executed
        //hence the target not found
        return -1;
    }
}


