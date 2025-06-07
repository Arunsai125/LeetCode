class Solution {
    public int reverse(int x) {
        long ans=0;
        while(x!=0){
            int d = x%10;
            ans = (long)(ans*10) + d;
            if(ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE) return 0;
            x/=10;
        }
    return (int)ans;
    }
}