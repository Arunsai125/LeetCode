class Solution {
    public int orangesRotting(int[][] grid) {
        int ans=0;
        int[] dx = {-1,0,1,0};
        int[] dy = {0,1,0,-1};
        Queue<int[]> q = new LinkedList<>();
        int freshCount = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0) continue;
                else if(grid[i][j]==1) freshCount++;
                else q.add(new int[]{i,j});
            }
        }
        while(!q.isEmpty()){
            int h = freshCount;
            int size = q.size();
            for(int k=0;k<size;k++){
                int[] temp = q.poll();
                for(int i=0;i<4;i++){
                    int newX = temp[0] + dx[i];
                    int newY = temp[1] + dy[i];
                    if(newX>=0 && newX<grid.length && newY>=0 && newY<grid[0].length && grid[newX][newY]==1){
                        freshCount--;
                        grid[newX][newY] = 2;
                        q.add(new int[]{newX,newY});
                    }
                }
            }
            if(freshCount!=h)ans++;
        }
    if(freshCount==0) return ans;
    return -1;
    }
}