class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] diffArray = new int[n+2];
        for(int[] booking : bookings){
            int start = booking[0];
            int end = booking[1]+1;
            int value = booking[2];
            diffArray[start] += value;
            diffArray[end] -= value;
        }
        int[] ans = new int[n];
        ans[0] = diffArray[1];
        for(int i=1;i<n;i++){
            ans[i] = diffArray[i+1] + ans[i-1];
        }
    return ans;
    }
}