class Solution {
    public int maxSum(int[] nums) {
        int ans = 0;
        int ans2 = nums[0];
        int sum=0;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i]) && nums[i] > 0){
                sum += nums[i];
                ans = Math.max(ans, sum);
                set.add(nums[i]);
            }
            else ans2 = Math.max(ans2, nums[i]);
        }
        if(ans==0) return ans2;
    return ans;
    }
}