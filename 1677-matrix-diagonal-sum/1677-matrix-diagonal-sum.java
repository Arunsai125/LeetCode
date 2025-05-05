class Solution {
    public int diagonalSum(int[][] mat) {
        int ans=0;
        int n = mat.length;
        int l1=0,l2=0;
        int r1=0,r2=n-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
              if(i==l1 && j==l2 || i==r1 && j==r2) ans += mat[i][j];
            }
            l1++;
            l2++;
            r1++;
            r2--;
        }
    return ans;
    }
}