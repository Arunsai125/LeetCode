class Solution {
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        boolean[][] visited = new boolean[m][n];
        Queue<int[]> q = new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j] == 'O' && (i==0 || j==0 || i==m-1 || j==n-1) && !visited[i][j]){
                   q.add(new int[]{i,j});
                   visited[i][j] = true;
                   bfs(q,visited,board);
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j] == 'O' && visited[i][j]==false) board[i][j] = 'X';
            }
        }
    }
    public void bfs(Queue<int[]> q, boolean[][] visited, char[][] board){
        int[] dx = {-1,0,1,0};
        int[] dy = {0,1,0,-1};
        while(!q.isEmpty()){
            int[] top = q.poll();
            for(int i=0;i<4;i++){
                int newX = top[0] + dx[i];
                int newY = top[1] + dy[i];
                if(newX>=0 && newX<board.length && newY>=0 && newY<board[0].length && !visited[newX][newY] && board[newX][newY] == 'O'){
                    visited[newX][newY] = true;
                    q.add(new int[]{newX,newY});
                }
            }
        }
    }
}