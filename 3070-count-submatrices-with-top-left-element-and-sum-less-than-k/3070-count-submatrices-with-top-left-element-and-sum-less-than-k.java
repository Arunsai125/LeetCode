class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int topLeftSum = grid[0][0];
        if(grid[0][0] > k) return 0;
        int ans = 1;
        for(int i=1;i<n;i++){
            grid[0][i] += grid[0][i-1];
            if(grid[0][i] <= k) ans++;
        }
        for(int i=1;i<m;i++){
            grid[i][0] += grid[i-1][0];
            if(grid[i][0] <= k) ans++;
        }
        if(ans==1) return 1;
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                grid[i][j] = grid[i][j-1] + grid[i-1][j] + grid[i][j] - grid[i-1][j-1];
                if(grid[i][j] <= k) ans++;
            }
        }
    return ans;
    }
}