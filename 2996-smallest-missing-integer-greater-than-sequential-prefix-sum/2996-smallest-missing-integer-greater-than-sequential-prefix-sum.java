class Solution {
    public int missingInteger(int[] nums) {
        boolean[] isPresent = new boolean[51];
        for(int i=0;i<nums.length;i++){
            isPresent[nums[i]] = true;
        }
        int target = nums[0];
        int start = 1;
        while(start<nums.length && nums[start] == (nums[start-1] + 1)){
            target += nums[start];
            start++;
        }
        while (target <= 50 && isPresent[target]) target++;
    return target;
    }
}