class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        if(obstacleGrid[0][0]==1) return 0;
        dp[0][0]=1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 && j==0 || obstacleGrid[i][j]==1) continue;
                else{
                    int left=0;
                    int up=0;
                   if(j-1>=0 && obstacleGrid[i][j-1]!=1)  left = dp[i][j-1];
                   if(i-1>=0 && obstacleGrid[i-1][j]!=1)  up = dp[i-1][j];
                    dp[i][j] = left + up;
                }
            }
        }
    return dp[m-1][n-1];
    }
}