class Solution {
    public int largestSubmatrix(int[][] matrix) {
        int ans = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==1 && i>0){
                    matrix[i][j] += matrix[i-1][j];
                }
            }
        }
        for(int[] mat : matrix){
            Arrays.sort(mat);
            for(int i=0;i<n;i++){
                ans = Math.max(ans, mat[i] * (n-i));
            }
        }
    return ans;
    }
}