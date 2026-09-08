class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] mins = new int[nums.length];
        mins[nums.length-1] = nums[nums.length-1];
        int min = mins[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            min = Math.min(nums[i], min);
            mins[i] = min;
        }
        int max = nums[0];
        for(int i=0;i<nums.length;i++){
            max = Math.max(max, nums[i]);
            if(max - mins[i] <= k) return i;
        }
    return -1;
    }
}