class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int count=0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String st= s.substring(i,j);
                long count1 = st.chars().filter(ch -> ch == '1').count();
                long count0 = st.chars().filter(ch -> ch == '0').count();
                if(count1<=k || count0<=k){
                    count+=1;
                }
            }
        }
        return count;
    }
}