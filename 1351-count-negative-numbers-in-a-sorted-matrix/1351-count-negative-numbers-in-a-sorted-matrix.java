class Solution {
    public int countNegatives(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int x = 0, y = c-1;
        int ans = 0;
        while(x<r && y>=0){
            if(grid[x][y] < 0){
                ans += r - x;
                y--;
            }
            else x++;
        } 
    return ans;
    }
}