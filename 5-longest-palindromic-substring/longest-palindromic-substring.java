class Solution {
    public String longestPalindrome(String s) {
      String res = s.substring(0,1);
      for(int i=0;i<s.length();i++){
        for(int j=i+1;j<s.length();j++){
            String temp=s.substring(i,j+1);
            if(checkpalindromic(temp) && res.length()<temp.length()){
                res=temp;
            }
        }
      }  
    return res;
    }
    private boolean checkpalindromic(String temp){
        int left=0;
        int right=temp.length()-1;
        while(left<right){
            if(temp.charAt(left)!=temp.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}