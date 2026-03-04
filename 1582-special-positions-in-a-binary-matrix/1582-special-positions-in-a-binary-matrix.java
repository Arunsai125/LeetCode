class Pair{
    int r;
    int c;
    public Pair(int r, int c){
        this.r=r;
        this.c=c;
    }
}

class Solution {
    public int numSpecial(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] rowSum = new int[m];
        int[] colSum = new int[n];
        Set<Pair> set = new HashSet<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==1){
                    rowSum[i] += mat[i][j];
                    colSum[j] += mat[i][j];
                    set.add(new Pair(i,j));
                }
            }
        }
        int ans=0;
        for(Pair p : set){
            if(rowSum[p.r]==1 && colSum[p.c]==1) ans++;
        }
    return ans;
    }
}