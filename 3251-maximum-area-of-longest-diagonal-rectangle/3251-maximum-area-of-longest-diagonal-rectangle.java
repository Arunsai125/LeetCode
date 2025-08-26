class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int ans = 0;
        double diag = 0.0;
        for(int[] arr : dimensions){
            double temp =  Math.sqrt( (arr[0]*arr[0]) + (arr[1]*arr[1]) );
            if(temp > diag){
                diag = temp;
                ans = arr[0]*arr[1];
            }
            if(temp==diag) ans = Math.max(ans, arr[0]*arr[1]);
        }
    return ans;
    }
}