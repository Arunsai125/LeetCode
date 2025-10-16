class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
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
    return ans;
    }
}