class Solution {
    public int removeElement(int[] nums, int val) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                int temp = nums[i];
                nums[i] = nums[ans];
                nums[ans] = temp;
                ans++;
            }
        }
    return ans;
    }
}