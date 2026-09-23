class Solution {
    public int totalMoney(int n) {
       int loop= n/7;
       int num=n%7;
       int initial=4;
       int ans=0;
       for(int i=0;i<loop;i++){
            ans+=(7*initial);
            initial+=1;
       } 
        loop+=1;
        int count=loop;
       for(int j=0;j<num;j++){
            ans+=count;
            count+=1;


       }
       return ans;
    }
}