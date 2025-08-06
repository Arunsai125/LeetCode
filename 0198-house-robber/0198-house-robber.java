class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n];
        Arrays.fill(dp, -1);
        return recursion(nums, dp, n-1);
    }
    public int recursion(int[] nums, int[] dp, int ind){
        if(ind == 0) return nums[0];
        if(ind == 1) return Math.max(nums[0],nums[1]);
        if(dp[ind]!=-1) return dp[ind];
        int ans = Integer.MIN_VALUE;
        if(ind-2>=0) ans = Math.max(ans, nums[ind] + recursion(nums, dp, ind-2));
        ans = Math.max(ans, recursion(nums, dp, ind-1));
    return dp[ind] = ans;
    }
}