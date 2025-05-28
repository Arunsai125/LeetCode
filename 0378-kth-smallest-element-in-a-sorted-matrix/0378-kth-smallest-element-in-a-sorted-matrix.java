class Solution {
    public int kthSmallest(int[][] matrix, int k) {
       int n = matrix.length;
       int start = matrix[0][0], end = matrix[n-1][n-1];
       while(start<end){
        int mid = start + (end-start)/2;
        int count = lesserNumberCount(mid, matrix);
        if(count < k){
            start = mid+1;
        }
        else{
            end=mid;
        }
       }
    return start;
    }
    public int lesserNumberCount(int tar, int[][] matrix){
        int ans=0;
        int i=0;
        int j = matrix.length-1;
        while(i<matrix.length && j>=0){
            if(matrix[i][j]<=tar){
                ans += (j+1);
                i++;
            }
            else{
                j--;
            }
        }
    return ans;
    }
}