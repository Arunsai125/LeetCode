class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int ans = 0;
        int[][] visited = new int[m][n];
        for(int[] guard : guards) visited[guard[0]][guard[1]] = 1;
        for(int[] wall : walls) visited[wall[0]][wall[1]] = 1;
        int dx[] = {-1,0,1,0};
        int dy[] = {0,1,0,-1};
        for(int[] guard : guards){
            int x = guard[0];
            int y = guard[1];
            for(int i=0;i<4;i++){
                int X = x + dx[i];
                int Y = y + dy[i];
                while(X>=0 && X<m && Y>=0 && Y<n){
                    if(visited[X][Y] == 1) break;
                    visited[X][Y] = 2;
                    X += dx[i];
                    Y += dy[i];
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(visited[i][j] == 0) ans++;
            }
        }
    return ans;
    }
}