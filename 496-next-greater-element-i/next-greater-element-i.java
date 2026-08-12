class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        ArrayList<Integer> nn = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            int j=0;
            while(nums1[i]!=nums2[j]){
                j++;
            }
            int foundvalue=-1;
            for(int k=j+1;k<nums2.length;k++){
                if(nums2[k]>nums2[j]){
                    foundvalue=nums2[k];
                    break;
                }
                
            }
            nn.add(foundvalue);
        }
        int[] ans = nn.stream().mapToInt(Integer::intValue).toArray();
        return ans;
    }
}