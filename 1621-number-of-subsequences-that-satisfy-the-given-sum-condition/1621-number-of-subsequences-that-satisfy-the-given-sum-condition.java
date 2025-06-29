class Solution {
    private final static int mod = 1_000_000_007;
    public int numSubseq(int[] nums, int target) {
        int ans=0;
        int[] arr = new int[nums.length];
        Arrays.sort(nums);
        arr[0]=1;
        for(int i=1;i<nums.length;i++){
            arr[i] = (arr[i-1]*2) % mod;
        }
        int start=0;
        int end=nums.length-1;
        while(start <= end){
            int sum = nums[start] + nums[end];
            if(sum > target) end--;
            else{
                ans =  (ans + arr[end-start]) % mod;
                start++;
            }
        }
    return ans;
    }
}