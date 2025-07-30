class Solution {
    public int longestSubarray(int[] nums) {
        int target = Integer.MIN_VALUE;
        for(int i : nums) target = Math.max(i, target);
        int ans=0;
        int c=0;
        for(int i : nums){
            if(i==target){
                c++;
                ans = Math.max(ans,c);
            }
            else c=0;
        }
    return ans;
    }
}