class Solution {
    public int countValidSelections(int[] nums) {
        int[] rightSum = new int[nums.length];
        rightSum[nums.length-1] = 0;
        int rSum=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            rightSum[i] = rSum;
            rSum += nums[i];
        }
        int lSum = 0;
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                if(Math.abs(lSum - rightSum[i]) == 1) ans += 1;
                if(lSum - rightSum[i] == 0 ) ans +=2;
            }
            lSum += nums[i];
        }
    return ans;
    }
}