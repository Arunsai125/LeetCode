class Solution {
    public long countCommas(long n) {
        if(n<1000) return 0;
        long ans = 0;
        ans += (long) (n-999);
        if(n>=1_000_000) ans += (long) (n-(long)999_999);
        if(n>=1_000_000_000) ans += (long) (n-(long)999_999_999);
        if(n>=(long)1_000_000_000_000l) ans += (long) (n-(long)999_999_999_999l);
        if(n>=(long)1_000_000_000_000_000l) ans += (long) (n-(long)999_999_999_999_999l);
    return ans;
    }
}