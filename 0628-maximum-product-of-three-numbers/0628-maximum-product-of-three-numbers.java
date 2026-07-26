class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int num1=nums[0]; int num4=nums[nums.length-1];
        int num2=nums[1]; int num5=nums[nums.length-2];
        int num3=nums[2]; int num6=nums[nums.length-3];
        int ans = num4*num5*num6;
        ans = Math.max(ans, num1*num2*num3);
        if (num1<0 && num2<0) ans = Math.max(ans, num1*num2*num4);
    return ans;
    }
}