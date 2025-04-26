class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n=mat.length;
        int m=mat[0].length;
        if(m*n != r*c) return mat;
        List<Integer> list = new ArrayList<>();
        for(int[] arr:mat){
            for(int i : arr) list.add(i);
        }
        int ans[][] = new int[r][c];
        int ptr=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                ans[i][j] = list.get(ptr++);
            }
        }
    return ans;
    }
}