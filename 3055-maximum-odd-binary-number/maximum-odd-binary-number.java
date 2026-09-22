class Solution {
    public String maximumOddBinaryNumber(String s) {
        int length=s.length();
        int bits=0;
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == '1') {
                bits++;
            }
        }
        bits-=1;
        String ans="";
        for(int j=0;j<length-1;j++){
            String app = (bits > 0) ? "1" : "0"; 
            ans+=app;
            bits--;
        }
        ans+="1";
        
    return ans;
}
}