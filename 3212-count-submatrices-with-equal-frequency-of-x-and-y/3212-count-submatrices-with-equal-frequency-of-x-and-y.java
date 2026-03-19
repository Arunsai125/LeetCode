class Solution {
    public int numberOfSubmatrices(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[] X = new int[n];
        int[] Y = new int[n];
        int ans=0;
        for(int i=0;i<m;i++){
            int cx=0;
            int cy=0;
            for(int j=0;j<n;j++){
                if(grid[i][j] == 'X') cx++;
                if(grid[i][j] == 'Y') cy++;
                X[j] += cx;
                Y[j] += cy;
                if(X[j] > 0 && X[j] == Y[j]) ans++;
            }
        }
    return ans;
    }
}