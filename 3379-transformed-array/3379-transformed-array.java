class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int[] result = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) result[i] = 0;
            else if(nums[i] > 0){
                int idx = nums[i]%nums.length;
                result[i] = nums[(i+idx)%nums.length];
            }
            else {
                int idx = (-1*nums[i])%nums.length;
                result[i] = nums[(i+nums.length-idx)%nums.length];
            }
        }
    return result;
    }
}