class Solution {
    public int findLHS(int[] nums) {
        int ans = 0;
        Arrays.sort(nums);
        int left=0;
        for(int right=1;right<nums.length;){
            if(nums[right]-nums[left]==1){
                ans = Math.max(ans, right-left+1);
                right++;
            }
            else if(nums[right]-nums[left] > 1){
                left++;
                
            }
            else right++;
        }
    return ans;
    }
}