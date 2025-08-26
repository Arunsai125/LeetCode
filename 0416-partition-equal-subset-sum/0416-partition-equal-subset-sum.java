class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i : nums) sum += i;
        if(sum%2 == 1) return false;
        int target = sum/2;
        int[][] dp = new int[nums.length][target+1];
        for(int[] arr : dp) Arrays.fill(arr, -1);
        return recursion(nums, target, nums.length-1, dp);
    }
    public boolean recursion(int[] nums, int target, int ind, int[][] dp){
        if(target==0) return true;
        if(ind==0 && target==nums[0]) return true;
        if(ind < 0) return false;
        if(dp[ind][target] != -1) return dp[ind][target] == 1 ? true : false;
        boolean notTake = recursion(nums, target, ind-1, dp);
        boolean take = false;
        if(nums[ind] <= target) take = recursion(nums, target - nums[ind], ind-1, dp);
        dp[ind][target] = take || notTake ? 1 : 0;
    return take || notTake;
    }
}