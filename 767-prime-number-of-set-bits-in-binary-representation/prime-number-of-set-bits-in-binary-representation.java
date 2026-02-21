class Solution {

    private boolean isPrime(int n){
        if(n==1){
            return false;
        }
        if(n==2){
            return true;
        }
        for(int k=2;k<=Math.sqrt(n);k++){
            if(n%k==0){
                return false;
            } 
        }
        return true;
    }
    public int countPrimeSetBits(int left, int right) {
        int numberOfSet=0;
        for(int i=left;i<=right;i++){
            int count=Integer.bitCount(i);

            if(isPrime(count)){
                numberOfSet++;
            }

        }
     return numberOfSet;   
    }
}