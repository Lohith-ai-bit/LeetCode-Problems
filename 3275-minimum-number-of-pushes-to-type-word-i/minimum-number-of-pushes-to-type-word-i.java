class Solution {
    public int minimumPushes(String word) {
        int l=word.length();
        int iter=l/8;
        int extra=l%8;
        int total=0;
        for(int i=0;i<=iter;i++){
            total+=8*i;
        }
        for(int j=0;j<extra;j++){
            total+=iter+1;
        }
     return total;   
    }
}