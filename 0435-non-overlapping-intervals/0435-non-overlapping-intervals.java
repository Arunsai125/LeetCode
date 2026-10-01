class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[1] - b[1]);
        int ans = 1;
        int lastVal = intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0] >= lastVal){
                ans++;
                lastVal = intervals[i][1];
            }
            else continue;
        }
    return intervals.length-ans;
    }
}