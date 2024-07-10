//question is to find richest customer in wealth
public class richestcustomerwealth {

    public int maximumWealth(int[][] accounts){
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length ; person++) {
            //when you start a new col , take a new sum for that row
            int sum = 0;
            for (int account = 0; account < accounts[person].length ; account++) {
               sum += accounts[person][account];
            }
            //now we have sum of account of persson
            //check with overall ans
            if (sum > ans ){
                ans = sum;
            }
        }
        return ans;
    }
}

