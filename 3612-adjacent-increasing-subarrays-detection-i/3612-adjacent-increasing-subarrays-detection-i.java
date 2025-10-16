class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int ans = 1;
        int curr=1;
        int prev=1;
        for(int i=1;i<nums.size();i++){
            if(nums.get(i) > nums.get(i-1)) curr++;
            else{
                prev = curr;
                curr = 1;
            }
            ans = Math.max(ans, curr/2);
            ans = Math.max(ans, Math.min(prev, curr));
        }
    return ans>=k;
    }
}