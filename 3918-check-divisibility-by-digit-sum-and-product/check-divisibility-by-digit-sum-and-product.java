class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int k=n;
        int prod=1;
        while(n>0){
            sum+=n%10;
            prod*=n%10;
            n=n/10;
        }
        if(k%(sum+prod)==0){
            return true;
        }
        else{
            return false;
        }
    }
}