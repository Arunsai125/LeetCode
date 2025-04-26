class Solution {
    public int maximumPossibleSize(int[] nums) {
        int c=1;
        int value = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>=value) {
                c++;
                value=nums[i];
            }
            else continue;
        }
    return c;
    }
}