class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] ans = new int[queries.length];
        for(int i=0;i<queries.length;i++){
            ans[i] = function(queries[i][0],queries[i][1],queries[i][2], points);
        }
    return ans;
    }
    public int function(int x, int y, int r, int[][] points){
        int res=0;
        for(int i=0;i<points.length;i++){
            int dis = (int)Math.pow(Math.abs(x-points[i][0]),2.0) + (int)Math.pow(Math.abs(y-points[i][1]),2.0 );
            if(dis<=r*r) res++;
        }
    return res;
    }
}