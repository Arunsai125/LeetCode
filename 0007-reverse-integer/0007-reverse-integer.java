class Solution {
    public int reverse(int x) {
        boolean sign=false;
        if(x<0){
            sign = true;
            x *= -1;
        }
        long ans=0;
        while(x!=0){
            int d = x%10;
            ans = (long)(ans*10) + d;
            if(ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE) return 0;
            x/=10;
        }
    return sign==true ? -1 * (int)ans : (int)ans;
    }
}