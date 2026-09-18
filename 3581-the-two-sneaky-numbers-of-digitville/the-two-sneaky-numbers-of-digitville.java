class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> arr= new ArrayList<>();
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                arr.add(nums[i]);
            }
        }
        int[] ans = new int[arr.size()];
        for(int j=0;j<arr.size();j++){
            ans[j]=arr.get(j);
        }
        return ans;
    }
}