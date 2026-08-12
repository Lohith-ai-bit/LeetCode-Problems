class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1= new Stack<>();
        Stack<Character> st2 = new Stack<>();
        int maxlength = Math.max(s.length(),t.length());
        for(int i=0;i<maxlength;i++){
            if(i<s.length()){
            if(s.charAt(i)=='#'){
                if(!st1.isEmpty()){
                st1.pop();
                }
            }
            else{
                st1.push(s.charAt(i));
            }
            }
            if(i<t.length()){
                if(t.charAt(i)=='#'){
                    if(!st2.isEmpty()){
                        st2.pop();
                }
                }
                else{
                    st2.push(t.charAt(i));
                }
            }
    }
    s="";
    t="";
    for(char ch:st1){
        s+=ch;
    }
    for(char sh:st2){
        t+=sh;
    }
        return s.equals(t);
    }
}