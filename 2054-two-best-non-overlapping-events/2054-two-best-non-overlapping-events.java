class Solution {
    public int maxTwoEvents(int[][] events) {
        int[][] dp = new int[events.length][3];
        for(int[] arr : dp) Arrays.fill(arr, -1);
        Arrays.sort(events, (a,b) -> a[0]-b[0]);
        int count = 0;
        return recursion(events, 0, count, dp);
    }
    public int recursion(int[][] events, int ind, int count, int[][] dp){
        if(ind >= events.length || count==2) return 0;
        if(dp[ind][count] != -1) return dp[ind][count];
        int nextValidIndex = binarySearch(events, events[ind][1], ind+1);
        int take = events[ind][2] + recursion(events, nextValidIndex, count+1, dp);
        int notTake = recursion(events, ind+1, count, dp);
    return dp[ind][count] = Math.max(take, notTake);
    }

    public int binarySearch(int[][] events, int target, int start){
        int end = events.length-1;
        int ans = events.length;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(events[mid][0] > target){
                ans = mid;
                end = mid-1;
            }
            else start = mid+1;
        }
    return ans;
    }
}