class Solution {
    public boolean isValid(String s) {
        Stack<Character> sb = new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='('||ch=='{'||ch=='['){
                sb.push(ch);
            }
            else if(sb.isEmpty()){
                return false;
            }
            else if((ch==')'&&sb.pop()!='(')||
                    (ch=='}'&&sb.pop()!='{')||
                    (ch==']'&&sb.pop()!='[')){
                        return false;
                    }
            
        }
        return sb.isEmpty();
    }
}