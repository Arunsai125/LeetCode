class Solution {
    public int centeredSubarrays(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            Set<Integer> set = new HashSet<>((n - i) * 2);
            long sum = 0;
            for (int j = i; j < n; j++) {
                set.add(nums[j]);
                sum += nums[j];
                if (sum >= Integer.MIN_VALUE && sum <= Integer.MAX_VALUE && set.contains((int) sum)) {
                    ans++;
                }
            }
        }
        return ans;
    }
}