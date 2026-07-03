class Solution {
    public int maximumSafenessFactor(List<List<Integer>> grid) {
        Queue<int[]> q = new LinkedList<>();
        int n = grid.size();
        int[][] manhattanDistance = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid.get(i).get(j) == 0) manhattanDistance[i][j] = -1;
                else {
                    manhattanDistance[i][j] = 0;
                    q.add(new int[]{i,j});
                }
            }
        }
        int[][] dir = {{-1,0},{0,1},{1,0},{0,-1}};
        while(!q.isEmpty()){
            int k = q.size();
            for(int i=0;i<k;i++){
                int[] temp = q.poll();
                int x = temp[0];
                int y = temp[1];
                for(int j=0;j<4;j++){
                    int dx = x + dir[j][0];
                    int dy = y + dir[j][1];
                    if(dx<0 || dx>=n || dy<0 || dy>=n) continue;
                    if(manhattanDistance[dx][dy] != -1) continue;
                    manhattanDistance[dx][dy] = Math.abs(dx-x) + Math.abs(dy-y) + manhattanDistance[x][y];
                    q.add(new int[]{dx,dy});
                }
            }
        }
        int start = 0;
        int end = n;
        int ans = 0;
        while(start <= end){
            int mid = ( start + end ) / 2;
            if(isSafeFactor(manhattanDistance, mid, dir, n)){
                ans = mid;
                start = mid + 1;
            }
            else{
                end = mid-1;
            }
        }
    return ans;
    }
    public boolean isSafeFactor(int[][] array, int factor, int[][] dir, int n){
        Queue<int[]> q = new LinkedList<>();
        if(array[0][0] < factor || array[n-1][n-1] < factor) return false;
        boolean[][] visited = new boolean[n][n];
        q.add(new int[]{0,0});
        visited[0][0] = true;
        while(!q.isEmpty()){
            int k = q.size();
            for(int i=0;i<k;i++){
                int[] temp = q.poll();
                int x = temp[0];
                int y = temp[1];
                if(x==n-1 && y==n-1) return true;
                for(int j=0;j<4;j++){
                    int dx = x + dir[j][0];
                    int dy = y + dir[j][1];
                    if(dx<0 || dx>=n || dy<0 || dy>=n) continue;
                    if(array[dx][dy] < factor || visited[dx][dy]) continue;
                    q.add(new int[] {dx,dy});
                    visited[dx][dy] = true;
                }
            }
        }
    return false;
    }
}