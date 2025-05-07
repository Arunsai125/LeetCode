class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] ans = new int[n-2][n-2];
        for(int i=0;i<n-2;i++){
            for(int j=0;j<n-2;j++){
                ans[i][j] = findValue(grid, i+1,j+1);
            }
        }
    return ans;
    }
    public int findValue(int[][] grid, int x, int y){
        int ans = Integer.MIN_VALUE;
        int[] dir = {-1,0,1};
        for(int dx : dir){
            for(int dy : dir){
                ans = Math.max(ans, grid[x+dx][y+dy]);
            }
        }
    return ans;
    }
}