class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] diffArray = new int[n+2];
        for(int[] booking : bookings){
            diffArray[booking[0]] += booking[2];
            diffArray[booking[1]+1] -= booking[2];
        }
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            diffArray[i+1] = diffArray[i+1] + diffArray[i];
            ans[i] = diffArray[i+1];
        }
    return ans;
    }
}