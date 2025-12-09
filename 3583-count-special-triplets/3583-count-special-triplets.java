class Solution {
    public int specialTriplets(int[] nums) {
        final int MOD = 1_000_000_007;
        int n = nums.length;
        Map<Integer, Long> suffix = new HashMap<>();
        for (int x : nums) {
            suffix.put(x, suffix.getOrDefault(x, 0L) + 1);
        }
        Map<Integer, Long> prefix = new HashMap<>();
        long ans = 0;
        for (int j = 0; j < n; j++) {
            int mid = nums[j];
            suffix.put(mid, suffix.get(mid) - 1);
            int t = mid * 2;
            long left = prefix.getOrDefault(t, 0L);
            long right = suffix.getOrDefault(t, 0L);
            ans = (ans + left * right) % MOD;
            prefix.put(mid, prefix.getOrDefault(mid, 0L) + 1);
        }
        return (int) ans;
    }
}
