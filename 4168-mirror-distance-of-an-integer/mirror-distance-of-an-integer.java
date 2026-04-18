class Solution {
    public int mirrorDistance(int n) {
        int m=reverse(n);
        return Math.abs(n-m);
    }
    int reverse(int n){
        int k=n;
        int l=0;
        while(k>0){
            l=l*10+k%10;
            k/=10;
        }
        return l;
    }
}