class Solution {
    public String thousandSeparator(int n) {
        String ans=String.valueOf(n);
        StringBuilder sc = new StringBuilder();
        int count=0;
        for(int i=ans.length()-1;i>=0;i--){
            sc.append(ans.charAt(i));
            count++;
            if(count==3&&i!=0){
                sc.append('.');
                count=0;
            }
            
        }
        return sc.reverse().toString();
        
    }
}