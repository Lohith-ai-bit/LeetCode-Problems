class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum1=1;
        if(num<=1) return false;
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                sum1+=i;
            }
        }
        return (num==sum1);
    }
    
}