class Solution {
    public int largestMagicSquare(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] rowSum = new int[m][n + 1];
        int[][] colSum = new int[m + 1][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                rowSum[i][j + 1] = rowSum[i][j] + grid[i][j];
                colSum[i + 1][j] = colSum[i][j] + grid[i][j];
            }
        }
        for (int k = Math.min(m, n); k >= 2; k--) {
            for (int i = 0; i <= m - k; i++) {
                for (int j = 0; j <= n - k; j++) {
                    if (isMagic(grid, rowSum, colSum, i, j, k)) {
                        return k;
                    }
                }
            }
        }
        return 1; 
    }
    private boolean isMagic(int[][] grid, int[][] rowSum, int[][] colSum, int r, int c, int k) {
        int targetSum = rowSum[r][c + k] - rowSum[r][c];
        for (int i = r + 1; i < r + k; i++) {
            if (rowSum[i][c + k] - rowSum[i][c] != targetSum) return false;
        }
        for (int j = c; j < c + k; j++) {
            if (colSum[r + k][j] - colSum[r][j] != targetSum) return false;
        }
        int diag1 = 0;
        for (int i = 0; i < k; i++) {
            diag1 += grid[r + i][c + i];
        }
        if (diag1 != targetSum) return false;
        int diag2 = 0;
        for (int i = 0; i < k; i++) {
            diag2 += grid[r + i][c + k - 1 - i];
        }
        return diag2 == targetSum;
    }
}