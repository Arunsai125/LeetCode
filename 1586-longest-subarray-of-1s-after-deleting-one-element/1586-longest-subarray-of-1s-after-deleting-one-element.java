class Solution {
    public int longestSubarray(int[] nums) {
        int count=0;
        int left=0;
        int ans=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]==0) count++;
            while(count>1){
                if(nums[left]==0) count--;
                left++;
            }
            ans = Math.max(ans, right-left);
        }
    return ans;
    }
}