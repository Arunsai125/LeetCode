class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        long[] rowSum = new long[m];
        long[] colSum = new long[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                rowSum[i] += (long) grid[i][j];
                colSum[j] += (long) grid[i][j];
            }
        }
        // Horizontal Cut
        long totalRowSum=0;
        for(int i=0;i<m;i++) totalRowSum += rowSum[i];
        long tempRowSum=0;
        for(int i=0;i<m;i++){
            tempRowSum += rowSum[i];
            if(totalRowSum - tempRowSum == tempRowSum) return true;
        }
        // Vertical Cut
        long totalColSum=0;
        for(int i=0;i<n;i++) totalColSum += colSum[i];
        long tempColSum=0;
        for(int i=0;i<n;i++){
            tempColSum += colSum[i];
            if(totalColSum - tempColSum == tempColSum) return true;
        }
    return false;
    }
}