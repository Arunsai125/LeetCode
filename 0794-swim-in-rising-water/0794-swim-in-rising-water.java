class Pair{
    int r;
    int c;
    public Pair(int r, int c){
        this.r=r;
        this.c=c;
    }
}

class Solution {
    public int swimInWater(int[][] grid) {
        int ans=grid[0][0];
        int start=grid[0][0];
        int end = (grid.length * grid.length) - 1;
        while(start<=end){
            int mid = (start+end) / 2;
            if(isPossible(grid, mid, grid.length)){
                ans = mid;
                end = mid-1;
            }
            else start = mid+1;
        }
        return ans;
    }

    public boolean isPossible(int[][] grid, int curr, int n){
        Queue<Pair> q = new LinkedList<>();
        boolean[][] visited = new boolean[n][n];
        visited[0][0] = true;
        q.offer(new Pair(0,0));
        int[] row = {-1,0,1,0};
        int[] col = {0,1,0,-1};
        while(!q.isEmpty()){
            int k = q.size();
            for(int i=0;i<k;i++){
                Pair temp = q.poll();
                int r = temp.r;
                int c = temp.c;
                if(r==n-1 && c==n-1) return true;
                for(int j=0;j<4;j++){
                    int newR = r + row[j];
                    int newC = c + col[j];
                    if(newR>=0 && newR < n && newC>=0 && newC<n && visited[newR][newC]==false && grid[newR][newC]<=curr){
                        visited[newR][newC] = true;
                        q.offer(new Pair(newR,newC));
                    }
                }
            }
        }
    return false;
    }
}