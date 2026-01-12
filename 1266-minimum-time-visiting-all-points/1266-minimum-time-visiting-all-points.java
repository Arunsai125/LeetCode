class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int n = points.length;
        int ans = 0;
        for(int i=1;i<n;i++){
            ans += countValue(points[i-1], points[i]);
        }
    return ans;
    }
    public int countValue(int[] arr1, int[] arr2){
        int x1 = arr1[0], y1 = arr1[1];
        int x2 = arr2[0], y2 = arr2[1];
        int hor_dis = Math.abs(x2-x1);
        int ver_dis = Math.abs(y1-y2);
    return Math.max(hor_dis, ver_dis);
    }
}