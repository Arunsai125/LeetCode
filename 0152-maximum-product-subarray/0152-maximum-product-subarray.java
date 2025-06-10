class Solution {
    public int maxProduct(int[] nums) {
        int leftProd = 1;
        int rightProd = 1;
        int ans = nums[0];
        int l = 0, r = nums.length-1;
        while(l<nums.length && r>=0){
            leftProd *= nums[l];
            rightProd *= nums[r];
            int temp = Math.max(leftProd, rightProd);
            ans = Math.max(ans, temp);
            if(leftProd == 0) leftProd=1;
            if(rightProd==0) rightProd=1;
            l++;
            r--; 
        }
    return ans;
    }
}