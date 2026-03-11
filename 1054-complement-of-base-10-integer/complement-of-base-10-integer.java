class Solution {
    public int bitwiseComplement(int n) {
        int bits=Integer.toBinaryString(n).length();
        int mask=(1<<bits)-1;
        n=n^mask;
        return n;
    }
}