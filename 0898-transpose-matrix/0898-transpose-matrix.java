class Solution {
    public int[][] transpose(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int ans[][] = new int[m][n];
        int r=0;
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(r<ans.length && c<ans[0].length){
                    ans[r][c] = matrix[i][j];
                    r++;
                }
                if(r==ans.length){
                    r=0;
                    c++;
                }
            }
        }
    return ans;
    }
}