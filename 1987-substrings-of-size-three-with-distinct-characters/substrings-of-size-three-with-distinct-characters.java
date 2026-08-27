class Solution {
    public int countGoodSubstrings(String s) {
        int count=0;
        for(int i=0;i<=s.length()-3;i++){
            String st=s.substring(i,i+3);
            if(st.charAt(0)!=st.charAt(1) && st.charAt(0)!=st.charAt(2) && st.charAt(1)!=st.charAt(2)){
                count+=1;
            }
        }
        return count;
    }
}