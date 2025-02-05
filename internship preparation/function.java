import java.util.Scanner;

public class function {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a  = sc.nextInt();
        int b = sc.nextInt();
        Swap();
        Sumofnum(a,b);
        ProductofNum(a,b);
        System.out.println(BinomialCoefficient(5,2));
        System.out.println(prime(32));
        System.out.println("Prime numbers in range up to 16:");
        PrimeinRange(16);
    }
    public  static void Sumofnum(int a, int b){//paraameters, formal parameters
        int Sum = a + b;
        System.out.println(" sum is :" + Sum);
    }
    //swap of value
    public static void Swap(){
        int a = 3;
        int b = 34;
        //swap
        int temp = a;
        a=b;
        b = temp;
        System.out.println("a = " +a);
        System.out.println("b = " + b);
    }
    //product of two num
    public static void ProductofNum(int a, int b){
        int Product = a * b ;
        System.out.println("Product is :" +Product);
         return  ;
    }
 // factorial of a number
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }
    //binomial coefficient
    public static int BinomialCoefficient(int n , int r) {
      int Fact_n = factorial(n);
      int Fact_r = factorial(r);
        int fact_nmr = factorial(n - r);

        int binomialcoefficient2 = Fact_n / (Fact_r * fact_nmr);
        return binomialcoefficient2;
    }
    //check if number is prime or not

    public static boolean prime(int n){
        if (n==1 || n == 0){
            System.out.println("nor prime nor composite");
        }
        if(n==2){
            return true;
        }
       boolean prime = true;
        for (int i = 2; i <=n-1 ; i++) {
            if (n % i == 0);
            prime = false;
        }return prime;
    }
    //print all prime number in range
    public static void PrimeinRange(int n){
        for (int i = 2; i <=n ; i++) {
            if (prime(i)){//true
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }


}
