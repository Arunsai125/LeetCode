class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        int sum = Arrays.stream(nums).sum();
        int initialVal = 0;
        for(int i=0;i<n;i++){
            initialVal += (i*nums[i]);
        }
        int ans = initialVal;
        int prevVal = initialVal;
        for(int i=1;i<n;i++){
            int temp = prevVal + sum - (n*(nums[n-i]));
            ans = Math.max(ans, temp);
            prevVal = temp;
        }
    return ans;
    }
}