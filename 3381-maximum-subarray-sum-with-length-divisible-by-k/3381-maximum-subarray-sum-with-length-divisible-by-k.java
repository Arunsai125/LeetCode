class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        int n = nums.length;
        long sum = 0, res = Long.MIN_VALUE;
        Map<Integer, Long> smallestSum = new HashMap<>();
        smallestSum.put(0, 0L);
        for (int i = 1; i <= n; i++) {
            sum += nums[i-1];
            if (smallestSum.containsKey(i % k)) 
                res = Math.max(res, sum - smallestSum.get(i % k));
            if (!smallestSum.containsKey(i % k) || smallestSum.get(i % k) > sum) 
                smallestSum.put(i % k, sum);
        }
        return res;
    }
}