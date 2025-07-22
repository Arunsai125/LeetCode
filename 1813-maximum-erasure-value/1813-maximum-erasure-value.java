class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        int left=0;
        int ans=0;
        int sum=0;
        for(int right=0;right<n;right++){
            while(set.contains(nums[right])){
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }
            sum += nums[right];
            set.add(nums[right]);
            ans = Math.max(ans, sum);
        }
    return ans;
    }
}