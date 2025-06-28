class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int[] ans = new int[k];
        int[][] temp = new int[nums.length][2];
        for(int i=0;i<nums.length;i++){
            temp[i][0] = nums[i];
            temp[i][1] = i;
        }
        Arrays.sort(temp, (a,b) -> b[0]-a[0]);
        Arrays.sort(temp, 0, k, (a,b) -> a[1]-b[1]);
        for(int i=0;i<k;i++){
            ans[i] = temp[i][0];
        }
    return ans;
    }
}