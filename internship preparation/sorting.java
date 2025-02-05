public class sorting {
    public static void main(String[] args) {
        int arr [] = {2,6,1 ,0, 9};
        //bubblesort(arr);
        //selectionsort(arr);
        insertionsort(arr);
    }
    public static void bubblesort(int arr[]) {
        for (int turn = 0; turn < arr.length -1 ; turn++) {
            for (int i = 0; i < arr.length-1-turn; i++) {
                if (arr[i] < arr[i+1]){
                    //swap
                    int temp= arr[i];
                    arr[i] = arr [i+1];
                    arr[i+1] = temp;
                }
            }
            Printarr(arr);
        }
    }
    public static void Printarr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    // selection sort
    public static void selectionsort(int arr[]){
        for (int i = 0; i <arr.length ; i++) {
            int minPos = i;
            for (int j = i+1; j < arr.length -1; j++) {
                if (arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            //swap
             int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
        Printarr(arr);
    }
// insertion sort
    public static void insertionsort(int arr[]){
        for (int i = 0; i <arr.length ; i++) {
            int curr = arr[i];
            int prev = i-1;
        //finding out the correct position to insert
            while( prev >= 0 && arr[prev] > curr){
                arr[prev + 1] = curr;
            }
        }
        Printarr(arr);
    }

}


