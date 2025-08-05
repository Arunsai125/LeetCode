class Solution {
    public int climbStairs(int n) {
        if(n<=2) return n;
        int secLast = 1;
        int last = 2;
        int ans=0;
        for(int i = 3;i<=n;i++){
            ans = last + secLast;
            secLast = last;
            last = ans;
        }
    return ans; 
    }
}