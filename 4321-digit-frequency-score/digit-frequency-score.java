class Solution {
    public int digitFrequencyScore(int n) {
        int[] freq = new int[10];
        int ans=0;
        String st=""+n;
        for(int i=0;i<st.length();i++){
            freq[(char)st.charAt(i)-'0']++;
        }
        for(int j=0;j<freq.length;j++){
            ans+=j*freq[j];
        }
        return ans;
    }
}