class Solution {
    public int islandPerimeter(int[][] grid) {
        int n=grid.length, m=grid[0].length;
        int islands=0;
        int neighbours=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    islands++;
                    if(i<n-1 && grid[i+1][j]==1) neighbours++;
                    if(j<m-1 && grid[i][j+1]==1) neighbours++;
                }
            }
        }
        return islands*4 - neighbours*2;
    }
}