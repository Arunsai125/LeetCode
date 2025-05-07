class Solution {
    public int[] leftRightDifference(int[] nums) {
        int leftSum1 = 0;
        int leftSum[] = new int[nums.length];
        leftSum[0] = 0;
        int rightSum1 = 0;
        int rightSum[] = new int[nums.length];
        for (int i = 1; i < nums.length; i++) {
            leftSum1 += nums[i - 1];  
            leftSum[i] = leftSum1;
        }
        rightSum[nums.length - 1] = 0;
        for (int i = nums.length - 2; i >= 0; i--) {
            rightSum1 += nums[i + 1]; 
            rightSum[i] = rightSum1;
        }
        int res[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return res;
    }
}