class Solution {
    public int numberOfBeams(String[] bank) {
        int total = 0;
        int prevCount = 0;
        for (String row : bank) {
            int currCount = 0;
            for (int i = 0; i < row.length(); i++) {
                if (row.charAt(i) == '1') {
                    currCount++;
                }
            }
            if (currCount == 0) continue;
            total += (prevCount * currCount);
            prevCount = currCount;
        }            
        return total;
    }
}
