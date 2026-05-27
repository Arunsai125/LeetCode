class Solution {
    public int minimumSwaps(int[] nums) {
        int count = 0;
        for(int i : nums) { if(i==0) count++; }
        int ans=0;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==0) count--;
            if(nums[i]!=0 && count>0){
                ans++;
                count--;
            }
        }
    return ans;
    }
}