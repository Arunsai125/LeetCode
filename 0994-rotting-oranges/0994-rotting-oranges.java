class Orange{
    int row;
    int col;
    int time;
    public Orange(int row, int col, int time){
        this.row=row;
        this.col=col;
        this.time=time;
    }
}

class Solution {
    public int orangesRotting(int[][] grid) {
        int ans = 0;
        int m = grid.length;
        int n = grid[0].length;
        int freshCount = 0;
        Queue<Orange> q = new LinkedList<>();
        boolean[][] visited = new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == 2){
                    q.add(new Orange(i,j,0));
                    visited[i][j] = true;
                }
                else if(grid[i][j]==1) freshCount++;
                else continue;
            }
        }
        int[] dirX = {-1,0,1,0};
        int[] dirY = {0,1,0,-1};
        int rottenOranges=0;
        while(!q.isEmpty()){
            int k = q.size();
            for(int i=0;i<k;i++){
                Orange curr = q.poll();
                ans = Math.max(ans, curr.time);
                int x = curr.row;
                int y = curr.col;
                int time = curr.time;
                for(int j=0;j<4;j++){
                    int newX = x + dirX[j];
                    int newY = y + dirY[j];
                    if(newX>=0 && newX<m && newY>=0 && newY<n && visited[newX][newY] == false && grid[newX][newY]==1){
                        rottenOranges++;
                        visited[newX][newY] = true;
                        q.add(new Orange(newX,newY,time+1));
                    }
                }
            }
        }
        if(rottenOranges != freshCount) return -1;
    return ans;
    }
}