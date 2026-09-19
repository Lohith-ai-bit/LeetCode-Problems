class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int dicount=0;
        for(int num:nums){
            while(num>0){
                int ddigit=num%10;
                if(ddigit==digit){
                    dicount+=1;
                }
                num/=10;
            }
        }
        return dicount;
    }
}