class Solution {
    public int minOperations(int[] nums, int x) {
        int totalSum = 0;
        for(int i : nums) totalSum += i;
        int targetSum = totalSum - x;
        if(targetSum == 0) return nums.length;
        int left=0;
        int maxLength=0;
        int curSum=0;
        for(int right=0;right<nums.length;right++){
            curSum += nums[right];
            while(curSum > targetSum && left<nums.length){
                curSum -= nums[left];
                left++;
            }
            if(curSum == targetSum) maxLength = Math.max(maxLength, right-left+1);
        }
    return maxLength==0 ? -1 : nums.length - maxLength;
    }
}