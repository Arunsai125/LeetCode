class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int[][] dp = new int[n][n];
        if(matrix.length==1) return matrix[0][0];
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<n;i++) dp[0][i] = matrix[0][i];
        for(int i=1;i<n;i++){
            for(int j=0;j<n;j++){
                int path1 = Integer.MAX_VALUE;
                int path2 = Integer.MAX_VALUE;
                int path3 = Integer.MAX_VALUE;
                if(j-1>=0) path1 = matrix[i][j] + dp[i-1][j-1];
                if(j>=0) path2 = matrix[i][j] + dp[i-1][j]; //just added to make sure the code looks uniform
                if(j+1<n) path3 = matrix[i][j] + dp[i-1][j+1];
                dp[i][j] = Math.min(Math.min(path1,path2),path3);
                if(i==n-1) ans = Math.min(ans, dp[i][j]);
            }
        }
    return ans;
    }
}