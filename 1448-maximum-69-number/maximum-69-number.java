class Solution {
    public int maximum69Number (int num) {
        ArrayList<Integer> sum= new ArrayList<>();
        int ans=0;
        while(num>0){
            int digit=num%10;
            sum.add(digit);
            num/=10;
        }
        int setcount=0;
        for(int i=sum.size()-1;i>=0;i--){
            
            if(sum.get(i)==6 && setcount==0){
                sum.set(i,9);
                setcount=1;
            }
            ans=ans*10+sum.get(i);
        }
        return ans;
    }
}