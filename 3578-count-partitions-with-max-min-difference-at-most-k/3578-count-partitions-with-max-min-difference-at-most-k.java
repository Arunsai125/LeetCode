import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    private static final int MOD = 1_000_000_007;
    public int countPartitions(int[] nums, int k) {
        int n = nums.length;
        Deque<Integer> maxD = new ArrayDeque<>();
        Deque<Integer> minD = new ArrayDeque<>();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        long sum = 1;
        int left = 0;
        for (int right = 0; right < n; right++) {
            while (!maxD.isEmpty() && nums[maxD.peekLast()] < nums[right]) maxD.pollLast();
            maxD.offerLast(right);
            while (!minD.isEmpty() && nums[minD.peekLast()] > nums[right]) minD.pollLast();
            minD.offerLast(right);
            while (nums[maxD.peekFirst()] - nums[minD.peekFirst()] > k) {
                if (maxD.peekFirst() == left) maxD.pollFirst();
                if (minD.peekFirst() == left) minD.pollFirst();
                sum = (sum - dp[left] + MOD) % MOD;
                left++;
            }
            dp[right + 1] = (int) sum;
            sum = (sum + dp[right + 1]) % MOD;
        }
        return dp[n];
    }
}
