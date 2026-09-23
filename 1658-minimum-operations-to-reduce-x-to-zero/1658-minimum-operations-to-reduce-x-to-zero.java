class Solution {
    public int minOperations(int[] nums, int x) {
        int totalSum=0;
        for(int i : nums) totalSum += i;
        int targetSum = totalSum - x;
        if(targetSum==0) return nums.length;
        int maxLength=0;
        int left=0;
        int sum=0;
        for(int right=0;right<nums.length;right++){
            sum += nums[right];
            while(sum > targetSum && left<nums.length){
                sum -= nums[left];
                left++;
            }
            if(sum == targetSum) maxLength = Math.max(maxLength, right-left+1);
        }
        if(maxLength==0) return -1;
    return nums.length-maxLength;
    }
}