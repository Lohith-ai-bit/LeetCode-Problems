class Solution {
    public boolean isValid(String s) {
        Stack<Character> sc = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(sc.isEmpty()) { sc.push(s.charAt(i)); }
            else if(sc.peek()=='(' && s.charAt(i)==')'){
                sc.pop();
            }
            else if(sc.peek()=='{' && s.charAt(i)=='}'){
                sc.pop();
            }
            else if(sc.peek()=='[' && s.charAt(i)==']'){
                sc.pop();
            }
            else{
                sc.push(s.charAt(i));
            }
            
        }
        return sc.isEmpty();
    }
}