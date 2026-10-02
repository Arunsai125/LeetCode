class Pair{
    private int row;
    private int col;
    public Pair(int row, int col){
        this.row=row;
        this.col=col;
    }
    public int getRow(){
        return this.row;
    }
    public int getCol(){
        return this.col;
    }
}

class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> ans = new ArrayList<>();
        int m = heights.length;
        int n = heights[0].length;
        Queue<Pair> q = new LinkedList<>();
        boolean[][] visPac = new boolean[m][n];
        boolean[][] visAtl = new boolean[m][n];
        for(int i=0;i<n;i++){
            q.add(new Pair(0,i));
            visPac[0][i] = true;
        }
        for(int i=1;i<m;i++){
            q.add(new Pair(i,0));
            visPac[i][0] = true;
        }
        int[] dx = {-1,0,1,0};
        int[] dy = {0,1,0,-1};
        while(!q.isEmpty()){
            Pair top = q.poll();
            int row = top.getRow();
            int col = top.getCol();
            for(int i=0;i<4;i++){
                int newRow = row + dx[i];
                int newCol = col + dy[i];
                if(newRow>=0 && newRow<m && newCol>=0 && newCol<n && visPac[newRow][newCol]==false && heights[newRow][newCol] >= heights[row][col]){
                    visPac[newRow][newCol] = true;
                    q.add(new Pair(newRow, newCol));
                }
            }
        }
        for(int i=0;i<m;i++){
            q.add(new Pair(i,n-1));
            visAtl[i][n-1] = true;
        }
        for(int i=0;i<n;i++){
            q.add(new Pair(m-1,i));
            visAtl[m-1][i] = true;
        }
        while(!q.isEmpty()){
            Pair top = q.poll();
            int row = top.getRow();
            int col = top.getCol();
            for(int i=0;i<4;i++){
                int newRow = row + dx[i];
                int newCol = col + dy[i];
                if(newRow>=0 && newRow<m && newCol>=0 && newCol<n && visAtl[newRow][newCol]==false && heights[newRow][newCol] >= heights[row][col]){
                    visAtl[newRow][newCol] = true;
                    q.add(new Pair(newRow, newCol));
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(visPac[i][j] == true && visAtl[i][j] == true) ans.add(Arrays.asList(i,j));
            }
        }
    return ans;
    }
}