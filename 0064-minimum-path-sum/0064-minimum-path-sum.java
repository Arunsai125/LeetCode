class Solution {
    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] dp = new int[n][m];
        for(int[] arr : dp) Arrays.fill(arr, -1);
    return recursion(grid, dp, n-1, m-1);
    }
    public int recursion(int[][] grid, int[][] dp, int i, int j){
        if(i==0 && j==0) return grid[0][0];
        if(dp[i][j]!=-1) return dp[i][j];
        int left = Integer.MAX_VALUE;
        int top = Integer.MAX_VALUE;
        if(j-1 >=0) left = grid[i][j] + recursion(grid, dp, i, j-1);
        if(i-1>=0) top = grid[i][j] + recursion(grid, dp, i-1, j);
    return dp[i][j] = Math.min(left, top);
    }
}