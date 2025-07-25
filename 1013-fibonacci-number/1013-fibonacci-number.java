class Solution {
    public int fib(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return recursion(n, dp);
    }
    public int recursion(int n, int[] dp){
        if(n<=1) return n;
        if(dp[n] != -1) return dp[n];
        return dp[n] = recursion(n-1, dp) + recursion(n-2, dp);
    }
}