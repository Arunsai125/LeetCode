class NumMatrix {
    int[][] prefix;
    public NumMatrix(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        prefix = new int[n][m];
        for(int i=0;i<n;i++){
            prefix[i][0] = matrix[i][0];
            for(int j=1;j<m;j++){
                prefix[i][j] = prefix[i][j-1] + matrix[i][j];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int ans=0;
        for(int i=row1;i<=row2;i++){
            int[] temp = prefix[i];
            ans += col1!=0 ? temp[col2] - temp[col1-1] : temp[col2];
        }
    return ans;
    }
}
