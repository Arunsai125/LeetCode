class Pair{
    int row;
    int col;
    public Pair(int row, int col){
        this.row = row;
        this.col = col;
    }
}


class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int ans = 0;
        boolean[][] visited = new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == 1){
                    ans = Math.max(ans, bfs(grid, visited, i, j , m, n));
                }
            }
        }
    return ans;
    }
    public int bfs(int[][] grid, boolean[][] visited, int i, int j, int m, int n){
        int[] dx = {-1,0,1,0};
        int[] dy = {0,1,0,-1};
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(i,j));
        visited[i][j] = true;
        int ans = 1;
        while(!q.isEmpty()){
            Pair top = q.poll();
            int row = top.row;
            int col = top.col;
            for(int k=0;k<4;k++){
                int newRow = row + dx[k];
                int newCol = col + dy[k];
                if(newRow>=0 && newRow<m && newCol>=0 && newCol<n && !visited[newRow][newCol] && grid[newRow][newCol]==1){
                    ans++;
                    q.add(new Pair(newRow, newCol));
                    visited[newRow][newCol] = true;
                }
            }
        }
    return ans;
    }
}