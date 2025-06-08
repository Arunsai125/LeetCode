class Solution {
    public void setZeroes(int[][] matrix) {
        boolean makeRowZero = false;
        boolean makeColZero = false;
        int n = matrix.length;
        int m = matrix[n-1].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    if(i==0) makeRowZero = true;
                    if(j==0) makeColZero = true;
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix[i][0] ==0 || matrix[0][j]==0){
                    matrix[i][j] = 0;
                }
            }
        }
        if(makeRowZero){
            for(int i=0;i<m;i++) matrix[0][i] = 0;
        }
        if(makeColZero){
            for(int i=0;i<n;i++) matrix[i][0] = 0;
        }
    }
}