class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.get(triangle.size()-1).size();
        int c = triangle.size()-1;
        int[][] dp = new int[n][n];
        dp[0][0] = triangle.get(0).get(0);
        if(triangle.size()==1) return dp[0][0];
        for(int i=1;i<triangle.size();i++){
            for(int j=0;j<triangle.get(i).size();j++){
                if(j==0) dp[i][j] = triangle.get(i).get(j) + dp[i-1][j];
                else if(j==triangle.get(i).size()-1) dp[i][j] = triangle.get(i).get(j) + dp[i-1][j-1];
                else{
                    int path1 = Integer.MAX_VALUE;
                    int path2 = Integer.MAX_VALUE;
                    path1 = triangle.get(i).get(j) + dp[i-1][j-1];
                    path2 = triangle.get(i).get(j) + dp[i-1][j];
                    dp[i][j] = Math.min(path1, path2);
                }
            }
        }
        int ans = dp[c][0];
        for(int i=1;i<n;i++) ans = Math.min(ans, dp[c][i]);
    return ans;
    }
}