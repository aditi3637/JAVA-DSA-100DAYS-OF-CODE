public class pattern7 {
    public static void main(String[] args) {
        pattern7(4);
    }
    static void pattern7(int n ){


        for (int row =1; row < n * 2; row++){
            int totalColsINRow = row > n ? 2 * n - row : row;

            int noofspaces = n - totalColsINRow;
            for (int s = 0; s < noofspaces ; s++) {
                System.out.print(" ");

            }
            for (int col = 1; col < totalColsINRow; col++) {
                System.out.print("* ");

            }
            //when one row is printed we need to add a new line
            System.out.println();

        }
    }
}
