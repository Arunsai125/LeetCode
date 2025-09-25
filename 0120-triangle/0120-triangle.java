class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.get(triangle.size()-1).size();
        int dp[][] = new int[n][n];
        dp[0][0] = triangle.get(0).get(0);
        if(triangle.size()==1) return dp[0][0];
        for(int i=1;i<n;i++){
            for(int j=0;j<i+1;j++){
                if(j==0)
                    dp[i][j] = triangle.get(i).get(j) + dp[i-1][j];
                else if(j==i){
                    dp[i][j] = triangle.get(i).get(j) + dp[i-1][j-1];
                }
                else{
                    int path1 = Integer.MAX_VALUE;
                    int path2 = Integer.MAX_VALUE;
                    path1 = triangle.get(i).get(j) + dp[i-1][j];
                    path2 =  triangle.get(i).get(j) + dp[i-1][j-1];
                    dp[i][j] = Math.min(path1, path2);
                }
            }
        }
        int ans = dp[n-1][0];
        for(int i=1;i<n;i++){
            ans = Math.min(ans, dp[n-1][i]);
        }
    return ans;
    }
}