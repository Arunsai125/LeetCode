class Solution {
    public int maximumDifference(int[] nums) {
        int ans = -1;
        int min = Integer.MAX_VALUE;
        for(int i : nums){
            min = Math.min(min, i);
            ans = Math.max(ans, i-min);
        }
        if(ans==0) return -1;
    return ans;
    }
}