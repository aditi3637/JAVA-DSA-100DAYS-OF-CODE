public class pattern6 {
    public static void main(String[] args) {
        pattern5(4);
    }
    static void pattern5(int n ){


        for (int row =1; row <= n * 2; row++){
            int totalColsINRow = row > n ? 2 * n - row : row;
            //for every row run the col
            for (int col = 1; col <= totalColsINRow; col++) {
                System.out.print("* ");

            }
            //when one row is printed we need to add a new line
            System.out.println();

        }
    }
}
