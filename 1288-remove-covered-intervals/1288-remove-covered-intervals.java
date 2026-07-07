class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (
            (a,b) -> {
                if(a[0] == b[0]) return b[1] - a[1];
            return a[0]-b[0];
            }
        ));
        int start = intervals[0][0];
        int end = intervals[0][1];
        int ans = 0;
        for(int i=1;i<intervals.length;i++){
            int tempStart = intervals[i][0];
            int tempEnd = intervals[i][1];
            if(tempStart >= start && tempEnd <= end){
                ans++;
            }
            else{
                start = tempStart;
                end = tempEnd;
            }
        }
    return intervals.length - ans;
    }
}