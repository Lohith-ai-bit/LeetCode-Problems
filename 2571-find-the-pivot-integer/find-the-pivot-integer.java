class Solution {
    public int pivotInteger(int n) {
        int total = 0;
        int left = 0;
        for(int i=1;i<=n;i++){
            total+=i;
        }
        for(int j=1;j<=n;j++){
            left+=j;
            int right=total-left+j;
            if(left==right){
                return j;
            }
        }
        return -1;
    }
}