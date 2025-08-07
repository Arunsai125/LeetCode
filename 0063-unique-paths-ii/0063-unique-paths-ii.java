class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        if(obstacleGrid[0][0]==1) return 0;
        int[][] dp = new int[m][n];
        for(int[] arr : dp) Arrays.fill(arr, -1);
    return recursion(obstacleGrid, dp, m-1,n-1);
    }
    public int recursion(int[][] nums, int[][] dp, int i, int j){
        if(i==0 && j==0) return 1;
        if( i<0 || j<0 || nums[i][j]==1 ) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int left = recursion(nums, dp, i, j-1);
        int top = recursion(nums, dp, i-1, j);
    return dp[i][j] = top + left;
    }
}