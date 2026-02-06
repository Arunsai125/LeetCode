class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int ans = 1;
        int left=0;
        for(int right=0;right<nums.length;right++){
            while(nums[right] > (long) nums[left]*k){
                left++;
            }
            ans = Math.max(ans, right-left+1);
        }
    return nums.length-ans;
    }
}