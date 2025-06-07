class Solution {
    public int removeDuplicates(int[] nums) {
        int ans=1;
        int j=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[j]) continue;
            else{
                ans++;
                j++;
                nums[j] = nums[i];
            }
        }
    return ans;
    }
}