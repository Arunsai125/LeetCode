class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int left=0;
        long sum=0;
        int ans=1;
        for(int right=0;right<nums.length;right++){
            sum += (long) nums[right];
            while(nums[right] * (right-left+1L) > sum + k){
                sum -= nums[left];
                left++;
            }
            ans = Math.max((int)ans, right-left+1);
        }
    return ans;
    }
}