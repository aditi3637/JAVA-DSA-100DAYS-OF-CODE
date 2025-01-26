import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        int count = 1;
        while (count <= 5){
            System.out.println(count);
            count++;
        }
        //for loop
        for (int i = 0; i < 25; i++) {
            System.out.println(i);
        }
        //square pattern of 4*4
        for (int rows = 1; rows <=4 ; rows++) {
                System.out.println("****");
        }
        //sum of natural number
        int sum = 0;
        for (int i = 2; i <=5; i++) {
           sum += i; // sum = sum + i ;
            System.out.println(sum);
        }
        //do while
        int n = 10899;
        while (n > 0 ){
          int  Lastdigit = n% 10;
            System.out.print(Lastdigit);
            n = n / 10;
        }
        //continue statement
        for (int i = 0; i <=50 ; i++) {
            if (i%10== 0){
                continue;
            }
            System.out.println(i);
        }
        // break
        Scanner sc = new Scanner(System.in);
       do {
           System.out.println("enter a num3 :");
           int num3 = sc.nextInt();
           if (num3%10==0) {
               break;
           }
           System.out.println(num3);
       }while (true);


    }
}
