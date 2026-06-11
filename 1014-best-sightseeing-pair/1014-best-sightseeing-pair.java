class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int firstValue = values[0] + 0;
        int ans=0;
        for(int i=1;i<values.length;i++){
            int secondValue = values[i]-i;
            ans = Math.max(ans, firstValue + secondValue);
            firstValue = Math.max(firstValue, values[i]+i);
        }
    return ans;
    }
}