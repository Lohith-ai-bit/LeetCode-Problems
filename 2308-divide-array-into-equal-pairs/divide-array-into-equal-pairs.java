class Solution {
    public boolean divideArray(int[] nums) {
       int alpair = (nums.length+1)/2;
       int countpair=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i+=2){
            if(nums[i]!=nums[i+1]){
                break;
            }else{
                countpair+=1;
            }
        } 
        return alpair==countpair;
    }
}