class Solution {
    public int change(int amount, int[] coins) {
        int[][] dp = new int[coins.length][amount+1];
        for(int[] arr : dp) Arrays.fill(arr, -1);
        return recursion(coins.length-1, coins, amount, dp);
    }
    public int recursion(int n, int[] coins, int target, int[][] dp){
        if(n==0){
            if(target % coins[0] == 0) return 1;
            else return 0;
        }
        if(dp[n][target] != -1) return dp[n][target];
        int notTake =0;
        notTake += recursion(n-1, coins, target, dp);
        int take=0;
        if(coins[n] <= target) take += recursion(n, coins, target - coins[n], dp);
        return dp[n][target] = take + notTake;
    }
}
    