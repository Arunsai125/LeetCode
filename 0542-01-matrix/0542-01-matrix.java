class Tuple{
    int row;
    int col;
    int dist;
    public Tuple(int row, int col, int dist){
        this.row=row;
        this.col=col;
        this.dist=dist;
    }
}
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] distance = new int[m][n];
        boolean[][] visited = new boolean[m][n];
        Queue<Tuple> q = new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j] == 0){
                    distance[i][j] = 0;
                    visited[i][j] = true;
                    q.add(new Tuple(i,j,0));
                }
            }
        }
        int[] dx = {-1,0,1,0};
        int[] dy = {0,1,0,-1};
        while(!q.isEmpty()){
            Tuple top = q.poll();
            int row = top.row;
            int col = top.col;
            int dist = top.dist;
            for(int i=0;i<4;i++){
                int newRow = row + dx[i];
                int newCol = col + dy[i];
                while(newRow>=0 && newRow<m && newCol>=0 && newCol<n && !visited[newRow][newCol]){
                    visited[newRow][newCol] = true;
                    distance[newRow][newCol] = dist+1;
                    q.add(new Tuple(newRow, newCol, dist+1));
                }
            }
        }
    return distance;
    }
}