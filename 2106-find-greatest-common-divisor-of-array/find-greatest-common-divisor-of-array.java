class Solution {
    public int findGCD(int[] nums) {
        int mini=Integer.MAX_VALUE;
        int maxi=0;
        for(int i=0;i<nums.length;i++){
            if(maxi<nums[i]){
                maxi=nums[i];
            }
            if(mini>nums[i]){
                mini=nums[i];
            }

        }
        return gcd(mini,maxi);
        
    }
    int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}