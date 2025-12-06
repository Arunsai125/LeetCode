class Solution {
    public int countPartitions(int[] nums) {
        int n = nums.length;
        int ans = 0;
        int[] suffixSum = new int[n];
        suffixSum[n-1] = nums[n-1];
        for(int i=n-2;i>=0;i--){
            suffixSum[i] = nums[i] + suffixSum[i+1];
        }
        int prefixSum=nums[0];
        for(int i=1;i<=n-1;i++){
            if(Math.abs(prefixSum - suffixSum[i]) % 2 == 0) ans ++;
            prefixSum += nums[i];
        }
    return ans;
    }
}