class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int rowStart = x;
        int rowEnd = x+k-1;
        int colStart = y;
        int colEnd = y+k-1;
        while(rowStart < rowEnd){
            for(int i=colStart;i<=colEnd;i++){
                int temp = grid[rowStart][i];
                grid[rowStart][i] = grid[rowEnd][i];
                grid[rowEnd][i]=temp;
            }
            rowStart++;
            rowEnd--;
        }
    return grid;
    }
}