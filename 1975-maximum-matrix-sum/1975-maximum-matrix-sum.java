class Solution {
    public long maxMatrixSum(int[][] matrix) {
       int countNegative = 0;
       int minValue = Integer.MAX_VALUE;
       int n = matrix.length;
       long sum = 0;
       for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j] < 0) countNegative ++;
                minValue = Math.min(minValue, Math.abs(matrix[i][j]));
                sum += (long) Math.abs(matrix[i][j]);
            }
       }
    if(countNegative % 2 == 0) return sum;
    return sum - 2*(minValue);
    }
}