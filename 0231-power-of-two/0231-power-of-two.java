class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==0 || n > Math.pow(2,31) - 1 || n < (Math.pow(2,31) - 1)*(-1)) return false;
        return((n&(n-1))==0);
    }
}