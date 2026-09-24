class Solution {
    public int smallestIndex(int[] nums) {
        int mini=Integer.MAX_VALUE;
        int minindex=-1;
        for(int i=0;i<nums.length;i++){
            int dummy=nums[i];
            int sum=0;
            while(dummy>0){
                int digit = dummy%10;
                sum+=digit;
                dummy/=10;
            }
            if(mini>sum && sum==i){
                mini=sum;
                minindex=i;
            }
            
        }
        return minindex;
    }
}