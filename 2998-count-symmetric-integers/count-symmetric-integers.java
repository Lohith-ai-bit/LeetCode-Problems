class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int i=low;i<=high;i++){
             int n=(int) Math.log10(i)+1;
             if(n%2!=0){
                continue;
             }
             int right=0;
             int temp=i;
             for(int j=0;j<n/2;j++)
             {
                int digit=temp%10;
                right+=digit;
                temp/=10;
             }
             int left=0;
             for(int k=0;k<n/2;k++){
                int digit=temp%10;
                left+=digit;
                temp/=10;
             }
             if(left==right){
            count+=1;
             }
        }
       
       return count;
    }
}