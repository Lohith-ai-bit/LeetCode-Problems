class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int ori=x;
        int total = 0;
        while(x>0){
            int digit=x%10;
            total+=digit;
            x/=10;
        }
        if(ori%total==0){
            return total;
        }
        return -1;
    }
}