class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        int[] dp1 = new int[nums.length];
        int[] dp2 = new int[nums.length];
        Arrays.fill(dp1, -1);Arrays.fill(dp2, -1);
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i!=0) list1.add(nums[i]);
            if(i!=nums.length-1) list2.add(nums[i]);
        }
    return Math.max(recursion(list1, dp1, nums.length-2), recursion(list2, dp2, nums.length-2));
    }
    public int recursion(List<Integer> nums, int[] dp, int ind){
        if(ind==0) return nums.get(0);
        if(ind==1) return Math.max(nums.get(0), nums.get(1));
        if(dp[ind]!=-1) return dp[ind];
        int ans = Integer.MIN_VALUE;
        ans = Math.max(ans, recursion(nums, dp, ind-1));
        ans = Math.max(ans, nums.get(ind) + recursion(nums, dp, ind-2));
        return dp[ind] = ans;
    }
}