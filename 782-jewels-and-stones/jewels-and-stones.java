class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        boolean[] jewels_arr = new boolean[128];
        for(char c:jewels.toCharArray()){
            jewels_arr[c]=true;
        }
        int count=0;
        for(char c: stones.toCharArray()){
            if(jewels_arr[c]){
                count++;
            }
        }
        return count;
    }
}