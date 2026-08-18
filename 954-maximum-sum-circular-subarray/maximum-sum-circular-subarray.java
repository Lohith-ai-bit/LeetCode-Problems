class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total=0;

        int minimum=Integer.MAX_VALUE;
        int maximum= Integer.MIN_VALUE;

        int minimumsum=0;
        int maximumsum=0;

        for(int num:nums){
            minimumsum=Math.min(num,minimumsum+num);
            minimum=Math.min(minimum,minimumsum);

            maximumsum=Math.max(num,maximumsum+num);
            maximum=Math.max(maximum,maximumsum);

            
            total+=num;
        }
        if(maximum<0){
                return maximum;
            }
        return Math.max(maximum,total-minimum);
    }
}