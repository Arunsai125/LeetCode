class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int[] result = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) result[i] = 0;
            else if(nums[i] > 0){
                result[i] = forwardTransform(nums, i, nums[i]);
            }
            else result[i] = backwardTransform(nums, i, -1 * nums[i]);
        }
    return result;
    }
    public int forwardTransform(int[] nums, int start, int target){
        int ans = nums[start];
        while(target!=0){
            target--;
            start++;
            ans = nums[start%nums.length];
        }
    return ans;
    }
    public int backwardTransform(int[] nums, int start, int target){
        int ans = nums[start];
        while(target!=0){
            target--;
            start--;
            ans = nums[(start + 100*nums.length)%nums.length];
        }
    return ans;
    }
}