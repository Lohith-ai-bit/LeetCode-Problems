class Solution {
    public int pivotIndex(int[] nums) {
    int totalsum=0;
    int leftsum=0;
    int rightsum=0;
     for (int i=0;i<nums.length;i++){
        totalsum+=nums[i]; 
     }   
     for (int j=0;j<nums.length;j++){
        
        leftsum+=nums[j];
        rightsum=totalsum-leftsum+nums[j];
        if(leftsum==rightsum){
            return j;
        }
     }
     return -1;
    }
}