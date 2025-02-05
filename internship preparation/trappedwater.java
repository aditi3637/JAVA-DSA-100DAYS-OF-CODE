public class trappedwater {
    public static void main(String args[]) {
        int height[] = {4, 2, 0, 6, 2, 5};
        System.out.println(trappedwater(height));
        //buy and sell stock
        int price[] = {7, 1, 5, 3, 6, 4};
        System.out.println(buyandsellstocks(price));
    }

    public static int trappedwater(int height[]) {
        int n = height.length;
        //calculate leftmax boundary - array
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
        }
        // calculate right max boundary
        int rightmax[] = new int[n];
        rightmax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);
        }
        int trappedwater = 0;
        //loop
        for (int i = 0; i < n; i++) {
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            //trapppedwater level = water level - height[i]
            trappedwater += waterlevel - height[i];
        }
        return trappedwater;
    }

    //buy and sell stocks on profitd
    public static int buyandsellstocks(int prices[]) {
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (buyprice < prices[i]) {
                int profit = prices[i] - buyprice;
                maxprofit = Math.max(maxprofit, profit);
            } else {
                buyprice = prices[i];
            }
        }
        return maxprofit;
    }
}
