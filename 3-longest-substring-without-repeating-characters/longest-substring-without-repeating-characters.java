class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] freq = new int[128];
        int left=0;
        int max=0;
        for(int right=0;right<s.length();right++){
            char rightchar= s.charAt(right);
            freq[rightchar]++;
            while(freq[rightchar]>1){
                char leftchar=s.charAt(left);
                freq[leftchar]--;
                left++;
            }
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}