class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] pre = new int[n];
        pre[0] = 1;
        pre[1] = nums[0];
        for(int i=2;i<n;i++){
            pre[i] = pre[i-1] * nums[i-1];
        }
        int[] post = new int[n];
        post[n-1] = 1;
        post[n-2] = nums[n-1];
        for(int i=n-3;i>=0;i--){
            post[i] = post[i+1] * nums[i+1];   
        }
        int[] ans = new int[n];
        for(int i=0;i<n;i++) ans[i] = pre[i] * post[i];
    return ans;
    }
}