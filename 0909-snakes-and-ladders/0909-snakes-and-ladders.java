class Solution {
    public int snakesAndLadders(int[][] board) {
        int n = board.length;
        int target = n*n;
        boolean[][] visited = new boolean[n][n];
        int ans = 0;
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        visited[n-1][0] = true;
        while(!q.isEmpty()){
            int k = q.size();
            for(int i=0;i<k;i++){
                Integer top  = q.poll();
                if(top == target) return ans;
                for(int j=1;j<=6;j++){
                    int newPos = top + j;
                    if(newPos > target) break;
                    int coords[] = findCoords(newPos,n);
                    int x = coords[0];
                    int y = coords[1];
                    if(visited[x][y] == true){
                        continue;
                    }
                    visited[x][y] = true;
                    if(board[x][y] == -1){
                        q.add(newPos);
                    }
                    else{
                        q.add(board[x][y]);
                    }
                }
            }
            ans++;
        }
    return -1;
    }
    public int[] findCoords(int value, int n){
        int originalRow = (value-1)/n;
        int row = n-1-originalRow;
        int originalCol = (value-1)%n;
        int col = (originalRow%2==1) ? n-1-originalCol : originalCol;
    return new int[]{row,col};
    }
}