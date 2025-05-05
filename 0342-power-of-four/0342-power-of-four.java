class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1) return true;
        if(n%4!=0) return false;
        if(n<=0) return false;
        while(n>1){
            int d = n%4;
            if(d!=0) return false;
            n/=4;
        }
    return true;
    }
}