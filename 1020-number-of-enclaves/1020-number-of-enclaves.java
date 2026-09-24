class Solution {
    public int numEnclaves(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        Queue<int[]> q = new LinkedList<>();
        for(int i=0;i<m;i++){
            if(grid[i][0] == 1) { q.add(new int[]{i,0}); visited[i][0] = true; }
            if(grid[i][n-1] == 1){ q.add(new int[]{i,n-1}); visited[i][n-1] = true; }
        }
        for(int i=0;i<n;i++){
            if(grid[0][i] == 1){ q.add(new int[]{0,i}); visited[0][i] = true; }
            if(grid[m-1][i] == 1){ q.add(new int[]{m-1,i}); visited[m-1][i] = true; }
        }
        bfs(q,visited,grid,m,n);
        int ans = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == 1 && !visited[i][j]) ans++;
            }
        }
    return ans;
    }
    public void bfs(Queue<int[]> q, boolean[][] visited, int[][] grid, int m, int n){
        int[] dx = {-1,0,1,0};
        int[] dy = {0,1,0,-1};
        while(!q.isEmpty()){
            int[] top = q.poll();
            for(int i=0;i<4;i++){
                int newX = top[0] + dx[i];
                int newY = top[1] + dy[i];
                if(newX>=0 && newX<m && newY>=0 && newY<n && !visited[newX][newY] && grid[newX][newY]==1){
                    visited[newX][newY] = true;
                    q.add(new int[]{newX,newY});
                }
            }
        }
    }
}