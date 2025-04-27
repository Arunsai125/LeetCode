class Solution {
    public int countSubarrays(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length-2;i++){
            int firstNumber = nums[i];
            int secondNumber = nums[i+1];
            int lastNumber = nums[i+2];
            if((firstNumber+lastNumber)*2 == secondNumber) ans++;
        }
    return ans;
    }
}