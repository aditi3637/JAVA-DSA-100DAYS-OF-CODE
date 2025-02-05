public class functionquestion {
    public static void main(String[] args) {
        binarytodecimal(101);
        decimaltobinary(10);
    }
    public  static void binarytodecimal(int binnum) {
        int pow = 0;
        int decnum = 0;
        int mynum = binnum;
        while (binnum > 0) {
            int lastdigit = binnum % 10;
            decnum = decnum + (lastdigit * (int) Math.pow(2, pow));
            pow++;
            binnum = binnum % 10;
        }
        System.out.println(" decimal of " + mynum + " = " + decnum);
    }
    // decimal to binary
    public static  void decimaltobinary(int decimalnum){
        int pow = 0;
        int binarynum = 0;
        while(decimalnum > 0 ){
            int rem = decimalnum % 2;
            binarynum = binarynum + rem * (int) Math.pow(10,pow);
            pow++;
            decimalnum = decimalnum %2;
        }
        System.out.println( " binary num of " + decimalnum +  " is " + binarynum);
    }


}
