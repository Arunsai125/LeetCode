class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int ans = 101;
        int index1 = -1;
        int index2 = -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1) index1 = i;
            if(nums[i]==2) index2 = i;
            if(index1 != -1 && index2 != -1) ans = Math.min(ans, Math.abs(index1-index2));
        }
        if(ans==101) return -1;
    return ans;
    }
}