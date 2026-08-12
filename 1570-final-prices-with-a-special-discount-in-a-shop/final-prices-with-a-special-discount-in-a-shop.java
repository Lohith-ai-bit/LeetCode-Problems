class Solution {
    public int[] finalPrices(int[] prices) {
        int[] ans = new int[prices.length];
        
        for(int i=0;i<prices.length;i++){
            int ss=prices[i];
            for(int j=i+1;j<prices.length;j++){
                if(j>i && prices[j]<= prices[i]){
                    ss=prices[i]-prices[j];
                    break;
                }
            
            }
            ans[i]=ss;
        }
        return ans;
    }
}