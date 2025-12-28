class Pair{
    int row;
    int col;
    Pair(int row, int col){
        this.row=row;
        this.col=col;
    }
}
class Solution {
    public int numIslands(char[][] grid) {
        int ans=0;
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visited = new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(visited[i][j]==false && grid[i][j]=='1'){
                    ans++;
                    bfs(grid,visited,i,j,n,m);
                }
            }
        }
    return ans;
    }
    public void bfs(char[][] grid, boolean[][] visited, int r, int c, int n, int m){
        Queue<Pair> q = new LinkedList<>();
        int[] row = {-1,0,1,0};
        int[] col = {0,1,0,-1};
        visited[r][c] = true;
        q.add(new Pair(r,c));
        while(!q.isEmpty()){
            Pair temp = q.poll();
            int ro = temp.row;
            int co = temp.col;
            for(int i=0;i<4;i++){
                int nrow = ro + row[i];
                int ncol = co + col[i];
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && visited[nrow][ncol]==false && grid[nrow][ncol]=='1'){
                    visited[nrow][ncol]=true;
                    q.add(new Pair(nrow,ncol));
                }
            }
        }
    }
}