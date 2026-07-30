class Solution {
    public int countDigits(int num) {
      int[] arr= new int[10];
      int count=0;
      int rum=num;
      int j=0;
      while(rum>0){
        arr[j]=rum%10;
        j+=1;
        rum/=10;
      }
      for(int i=0;i<j;i++){
        if(num%arr[i]==0){
            count+=1;
        }
      }
      return count;
    }
}