class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int[] arr : dp) Arrays.fill(arr, -1);
    return recursion(dp, m-1,n-1);
    }
    public int recursion(int[][] dp, int i, int j){
        if(i==0 && j==0) return 1;
        if(i<0 || j<0) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        int left = recursion(dp, i, j-1);
        int top = recursion(dp, i-1, j);
    return dp[i][j] = top + left;
    }
}