class Solution {
    public int numSteps(String s) {
        int carry=0;
        int ans=0;
        for(int i=s.length()-1;i>=1;i--){
            int digit=s.charAt(i)-'0'+carry;
            if(digit==1){
                carry=1;
                ans+=2;
            }
            else if(digit==0){
                ans+=1;
                carry=0;
            }
            else if(digit==2){
                ans+=1;
                carry=1;
            }

        }
        if(carry==1){
            ans+=1;

            
        }
        return ans;
    }
}