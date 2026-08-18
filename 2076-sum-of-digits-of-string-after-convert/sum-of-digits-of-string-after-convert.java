class Solution {
    public int getLucky(String s, int k) {
        long sum=0;
        for(char ch:s.toCharArray()){
            int num=ch-'a'+1;
            sum+=(num>9) ? num/10+num%10:num;
        }
        for(int i=1;i<k;i++){
            int res=0;
           while(sum>0){
            res+=sum%10;
            sum/=10;
           } 
           sum=res;
        }
      return (int)sum;  
    }
}