class Solution {
    public int largestAltitude(int[] gain) {
        int start=0;
        int ans=0;
        for(int i=0;i<gain.length;i++){
            int tmp = gain[i] + start;
            start += gain[i];
            ans = Math.max(ans, tmp);
        }
    return ans;
    }
}