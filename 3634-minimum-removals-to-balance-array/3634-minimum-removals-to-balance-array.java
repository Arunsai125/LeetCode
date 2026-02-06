class Solution {
    public int minRemoval(int[] nums, int k) {
        int ans = 1;
        int n = nums.length;
        Arrays.sort(nums);
        int left=0;
        for(int right=0;right<nums.length;right++){
            while(nums[right] > (long) nums[left] * k){
                left++;
            }
            ans = Math.max(ans, right-left+1);
        }
    return n - ans;
    }
}