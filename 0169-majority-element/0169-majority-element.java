class Solution {
    public int majorityElement(int[] nums) {
        int ans = nums[0];
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(c==0){
                ans = nums[i];
                c++;
            }
            else if(nums[i]==ans) c++;
            else c--;
        }
    return ans;
    }
}