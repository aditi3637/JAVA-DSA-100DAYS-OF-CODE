public class pattern5 {
    public static void main(String[] args) {
        pattern5(4);
    }
    static void pattern5(int n ){


        for (int row =1; row <= n; row++) {
            //for every row run the col
            for (int col = 1; col <= n-row+1; col++) {
                System.out.print("* ");

            }
            //when one row is printed we need to add a new line
            System.out.println();

        }
    }
}
