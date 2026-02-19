class Solution {
    public boolean isPowerOfFour(int n) {
      int mask=0x55555555;
      if(n<=0) return false;
      if ((n&(n-1))!=0) return false;
      return (n & mask)!=0;
    }
}