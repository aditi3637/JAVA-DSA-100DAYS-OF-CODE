public class numberprogam  {
    public static void main(String[] args) {
        print(1);
    }

    private static void print(int n) {
        if (n == 6 ){
            return;
        }
        System.out.println(n);
        print( n + 1);
    }
//    private static void print2(int n) {
//        System.out.println(n);
//        print3(3);
//    }
//    private static void print3(int n) {
//        System.out.println(n);
//        print4(4);
//    }
//    private static void print4(int n) {
//        System.out.println(n);
//        print5(5);
//    }
//    private static void print5(int n) {
//        System.out.println(n);
//    }
}
