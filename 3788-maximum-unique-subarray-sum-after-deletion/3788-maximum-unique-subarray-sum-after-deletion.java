class Solution {
    public int maxSum(int[] nums) {
        boolean[] found = new boolean[101];
        int sum = 0, largestNegative = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num <= 0) {
                largestNegative = Math.max(largestNegative, num);
                continue;
            }
            if (found[num]) {
                continue;
            }
            found[num] = true;
            sum += num;
        }
        return sum == 0 ? largestNegative : sum;
    }
}