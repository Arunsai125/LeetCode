class DisjointSet{
    int[] parent;
    int[] size;
    public DisjointSet(int n){
        parent = new int[n];
        size = new int[n];
        for(int i=0;i<n;i++){
            parent[i]=i;
            size[i]=1;
        }
    }
    public int findParent(int n){
        if(parent[n]==n) return n;
        int up = findParent(parent[n]);
        parent[n] = up;
    return parent[n];
    }
    public void unionBySize(int a, int b){
        int upa = findParent(a);
        int upb = findParent(b);
        if(upa==upb) return;
        if(size[upa]<size[upb]){
            parent[upa] = upb;
            size[upb] += size[upa];
        }
        else{
            parent[upb] = upa;
            size[upa] += size[upb];
        }
    }
}

class Solution {
    public int largestIsland(int[][] grid) {
        int c=0;
        int n = grid.length;
        DisjointSet ds = new DisjointSet(n*n);
        List<Integer> list = new ArrayList<>();
        int[] dx = {-1,0,1,0};
        int[] dy = {0,1,0,-1};
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==0){
                    list.add(i*n+j);
                }
                else{
                    c++;
                    for(int k=0;k<4;k++){
                        int nRow = i + dx[k];
                        int nCol = j + dy[k];
                        if(nRow>=0 && nRow<n && nCol>=0 && nCol<n && grid[nRow][nCol]==1){
                            int curr = i*n+j; 
                            int adj = nRow*n+nCol;
                            ds.unionBySize(curr, adj);
                        }
                    }
                }
            }
        }
        if(c==n*n) return n*n;
        int ans = 0;
        for(int i : list){
            int row = i/n;
            int col = i%n;
            Set<Integer> set = new HashSet<>();
            for(int k=0;k<4;k++){
                int newRow = row + dx[k];
                int newCol = col + dy[k];
                if(newRow>=0 && newRow<n && newCol>=0 && newCol<n && grid[newRow][newCol]==1){
                    set.add(ds.findParent(newRow*n+newCol));
                }
            }
            int curMax = 1;
            for(int l : set){
                curMax += ds.size[l];
            }
        ans = Math.max(curMax, ans);
        }
    return ans;
    }
}