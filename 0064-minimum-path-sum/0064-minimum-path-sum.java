class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        for(int[] arr : dp) Arrays.fill(arr, -1);
    return recursion(grid, dp, m-1, n-1);
    }
    public int recursion(int[][] grid, int[][] dp, int i, int j){
        if(i==0 && j==0) return grid[0][0];
        if(dp[i][j]!=-1) return dp[i][j];
        int path1 = Integer.MAX_VALUE;
        int path2 = Integer.MAX_VALUE;
        if(j-1>=0) path1 = grid[i][j] + recursion(grid, dp, i, j-1);
        if(i-1>=0) path2 = grid[i][j] + recursion(grid, dp, i-1, j);
        return dp[i][j] = Math.min(path1, path2);
    }
}