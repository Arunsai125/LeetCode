class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for(int[] account : accounts){
            ans = Math.max(ans, sum(account));
        }
    return ans;
    }
    public int sum(int[] nums){
        int ans=0;
        for(int i : nums) ans+=i;
    return ans;
    }
}