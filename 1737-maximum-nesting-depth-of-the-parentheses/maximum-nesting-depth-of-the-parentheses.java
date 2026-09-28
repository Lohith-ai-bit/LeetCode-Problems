class Solution {
    public int maxDepth(String s) {
        int maxdepth=0;
        int depth=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                depth+=1;
            }
            if(s.charAt(i)==')'){
                depth-=1;
            }
            maxdepth=Math.max(maxdepth,depth);
        }
        return maxdepth;
    }
}