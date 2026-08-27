class Solution {
    public int minOperations(int[] nums) {
        int left=0;
        int right=2;
        int count=0;
        while(left<right && right<=nums.length-1){
            while(nums[left]==1 && right<=nums.length-1){
                right++;
                left++;
            }
            if(nums[left]==0 && right<=nums.length-1){
                int l=left;
                count+=1;
                 for(int i=l;i<=right;i++){
                    if(nums[l]==0){
                        nums[l]=1;
                    }             
                    else{
                        nums[l]=0;
                    } 
                    l++;
                      
            }
            left+=1;
            right+=1;
            }
           
        }
        for(int k=0;k<nums.length;k++){
            if(nums[k]==0){
                return -1;
            }
        }
        return count;
    }
}