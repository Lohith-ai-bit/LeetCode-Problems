class Solution {
    public boolean hasSameDigits(String s) {
       while(s.length()>2){
            StringBuilder st = new StringBuilder(); 
       for(int i=0;i<s.length()-1;i++){
            int n1=s.charAt(i)-'0';
             int n2=s.charAt(i+1)-'0';
            st.append((n1+n2)%10);
       }
       s=st.toString();
    }

       return (s.charAt(0)== s.charAt(1));
    }
}