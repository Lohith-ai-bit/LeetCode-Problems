class Solution {
    public int[] decrypt(int[] code, int k) {
        int n=code.length;
        int[] res= new int[n];
        if(k==0){
            return res;
        }
        for(int i=0;i<code.length;i++){
            int sum=0;
            if(k>0){
                for(int l=i+1;l<=k+i;l++){
                    sum+=code[(l)%n];
                }
            }
            else{
                for(int m=1;m<=-k;m++){
                    sum+=code[(i-m+n)%n];
                }
            }
            res[i]=sum;
        }
        return res;
    }
}