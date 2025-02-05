public class selectionsort {
    public static void main(String[] args) {
        int arr[] = {5, 1, 0, 6, 2};

        // Copy the array to preserve the original for each sorting method
        int bubbleArr[] = arr.clone();
        int selectionArr[] = arr.clone();

        // Bubble Sort
        System.out.print("Bubble Sort: ");
        Bubblesorting(bubbleArr);
        Printarr(bubbleArr);

        // Selection Sort
        System.out.print("Selection Sort: ");
        Selectionsort(selectionArr);
        Printarr(selectionArr);
    }

    public static void Bubblesorting(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int j = 0; j < arr.length - turn - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void Printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void Selectionsort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            // Swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }
}

