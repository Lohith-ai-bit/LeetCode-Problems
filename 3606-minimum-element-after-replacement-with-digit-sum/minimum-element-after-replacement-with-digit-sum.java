class Solution {
    public int minElement(int[] nums) {
        int mini = Integer.MAX_VALUE;
       for(int i=0;i<nums.length;i++){
        int sup=nums[i];
        int comsum=0;
            while(sup>0){
                int digit=sup%10;
                comsum+=digit;
                sup=sup/10;
            }
            mini=Math.min(mini,comsum);
       } 
       return mini;
    }
}