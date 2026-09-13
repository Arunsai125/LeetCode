class Solution {
    public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {
        for(int i=0;i<n;i++){
            if(rowShift[i]==0) continue;
            transformRow(grid,i,rowShift[i]);
        }
        for(int i=0;i<n;i++){
            if(colShift[i]==0) continue;
            transformCol(grid,i,colShift[i]);
        }
    return grid;
    }
    public void transformRow(int[][] grid, int row, int k){
        k = k%grid.length;
        int[] temp = new int[grid.length];
        for(int i=0;i<grid.length;i++){
            temp[i] = grid[row][i];
        }
        for(int i=0;i<grid.length;i++){
            grid[row][i] = temp[(i+k)%grid.length];
        }
    }
    public void transformCol(int[][] grid, int col, int k){
        k = k%grid.length;
        int[] temp = new int[grid.length];
        for(int i=0;i<grid.length;i++){
            temp[i] = grid[i][col];
        }
        for(int i=0;i<grid.length;i++){
            grid[i][col] = temp[(i+k)%grid.length];
        }
    }
}