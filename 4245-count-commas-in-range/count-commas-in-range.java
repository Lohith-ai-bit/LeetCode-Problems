class Solution {
    public int countCommas(int n) {
        int c=0;
        for(int i=n;i>=1000;i--){
            c+=1;
        }
        return c;
    }
}