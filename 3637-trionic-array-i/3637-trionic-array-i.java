class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        boolean bp1 = false;
        boolean bp2 = false;
        boolean bp3 = false;
        int start = 1;
        while(start < n  && nums[start] > nums[start-1]) { bp1 = true; start++; }
        while(start < n && nums[start] < nums[start-1]) { bp2 = true; start++; }
        while(start < n && nums[start] > nums[start-1]) { bp3 = true; start++; }
    return start==n && bp1 && bp2 && bp3;
    }
}