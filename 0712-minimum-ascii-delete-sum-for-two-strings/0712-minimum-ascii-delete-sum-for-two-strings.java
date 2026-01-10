class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int[][] dp = new int[1001][1001];
        for(int[] arr : dp) Arrays.fill(arr, -1);
        return solve(0,0,n,m,s1,s2,dp);
    }
    public int solve(int i, int j, int n, int m, String s1, String s2, int[][] dp){
        if(dp[i][j] != -1) return dp[i][j];
        if(i>=n && j>=m) return 0;
        else if(i>=n) return dp[i][j] = s2.charAt(j) + solve(i,j+1,n,m,s1,s2,dp);
        else if(j>=m) return dp[i][j] = s1.charAt(i) + solve(i+1,j,n,m,s1,s2,dp);
        else if(s1.charAt(i) == s2.charAt(j)) return dp[i][j] = 0 + solve(i+1,j+1,n,m,s1,s2,dp);
        int take_s1_i = s1.charAt(i) + solve(i+1,j,n,m,s1,s2,dp);
        int take_s2_j = s2.charAt(j) + solve(i,j+1,n,m,s1,s2,dp);
        return dp[i][j] = Math.min(take_s1_i, take_s2_j);
    }
}