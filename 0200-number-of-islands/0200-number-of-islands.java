class Pair{
    int x;
    int y;
    public Pair(int x, int y){
        this.x=x;
        this.y=y;
    }
}

class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int ans=0;
        boolean[][] visited = new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == '1' && !visited[i][j]){
                    ans++;
                    dfs(grid, visited, i, j);
                }
            }
        }
    return ans;
    }
    public void dfs(char[][] grid, boolean[][] visited, int i, int j){
        int[] dirX = {-1,0,1,0};
        int[] dirY = {0,1,0,-1};
        visited[i][j] = true;
            for(int k=0;k<4;k++){
                int newX = i + dirX[k];
                int newY = j + dirY[k];
                if(newX>=0 && newX<grid.length && newY>=0 && newY<grid[0].length && visited[newX][newY]==false && grid[newX][newY]=='1'){
                    visited[newX][newY] = true;
                    dfs(grid, visited, newX, newY);
                }
            }
        }
}