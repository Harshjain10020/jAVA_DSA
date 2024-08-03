public class arraycode {

    public static int trapwater(int height[]) {
        int n = height.length;
        // calculate left max boundary
        int leftmax[]= new int[n];
        leftmax[0]= height[0];
        for (int i = 1; i < n; i++) {
            leftmax[i]= Math.max(height[i], leftmax[i-1]);
        }
        // calculate rigth max boundary

        int rightmax[]= new int[n];
        rightmax[n-1]= height[n-1];
        for (int i = n-2; i >= 0; i--) {
            rightmax[i]= Math.max(height[i], rightmax[i+1]);
        }
        //loop
        int trapwater = 0;
        for (int i = 0; i < n; i++) {
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            trapwater += waterlevel - height[i];
            
        }
        return trapwater;
        //waterlevel = min(leftmax , rightmax)
        //traped water = waterlevel - height[i]
    }



    //buy& sell stock
    public static int buy_sell(int prices[]){
        int buyprices= Integer.MAX_VALUE;
        int maxprofit = 0 ;
        for (int i = 0; i < prices.length; i++) {
            if (buyprices<prices[i]) {//profit
                int profit = prices[i]- buyprices;
                maxprofit = Math.max(maxprofit, profit);
                
            }else{
                buyprices = prices[i];
            }
        }
        return maxprofit;
    }



    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        // System.out.println(trapwater(height));
        int prices[]= {7,1,5,3,6,4};
        System.out.println(buy_sell(prices));
    }
}