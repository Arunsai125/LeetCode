class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            long sum = 0;
            for(int j=i;j<nums.length;j++){
                sum += (long) nums[j];
                if(isValidSubarraySum(sum, x)) ans++;
            }
        }
    return ans;
    }
    public boolean isValidSubarraySum(long sum, int x){
        if(sum%10 != x) return false;
        while(sum>=10){
            sum=sum/10;
        }
    return sum == x;
    }
}