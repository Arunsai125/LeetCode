class Solution {
    public int minimumDeletions(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int mini = -1;
        int maxi = -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] < min){
                min = nums[i];
                mini = i;
            }
            if(nums[i] > max){
                max = nums[i];
                maxi = i;
            }
        }
        int left = Math.min(mini, maxi);
        int right = Math.max(maxi,mini);
        return Math.min(left+1+nums.length-right,Math.min(right+1,nums.length-left));
    }
}