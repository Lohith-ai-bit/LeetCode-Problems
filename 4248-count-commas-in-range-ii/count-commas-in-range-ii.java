class Solution {
    public long countCommas(long n) {
        long count=0;
        if(n>=1_000L){
            count+=n-999L;
        }
        if(n>=1_000_000L){
            count+=n-999_999L;
        }
        if(n>=1_000_000_000L){
            count+=n-999_999_999L;
        }
        if(n>=1_000_000_000_000L){
            count+=n-999_999_999_999L;
        }
        if(n>=1_000_000_000_000_000L){
            count+=n-999_999_999_999_999L;
        }
        return count;
    }
}