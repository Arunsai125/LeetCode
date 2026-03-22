class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        if(areMatricesEqual(mat, target, mat.length)) return true;
        int count=3;
        while(count > 0){
            count--;
            int[][] matrix = rotateMatrix(mat, mat.length);
            if(areMatricesEqual(matrix, target, mat.length)) return true;
        }
    return false;
    }
    public int[][] rotateMatrix(int[][] mat, int n){
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        for(int[] nums : mat){
            int start = 0;
            int end = n-1;
            while(start<end){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
        return mat;
    }
    public boolean areMatricesEqual(int[][] mat1, int[][] mat2, int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(mat1[i][j] != mat2[i][j]) return false;
            }
        }
    return true;
    }
}