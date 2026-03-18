class Solution {
    public long gcdSum(int[] nums) {
       int prefixGcd[] = new int[nums.length];
       int max = nums[0];
       prefixGcd[0] = nums[0];
       for(int i=1;i<nums.length;i++){
            max = Math.max(max, nums[i]);
            prefixGcd[i] = findGCD(nums[i], max);
       }
       Arrays.sort(prefixGcd);
       int start = 0;
       int end = nums.length-1;
       long ans = 0;
       while(start<end){
            ans += (long) findGCD(prefixGcd[start++], prefixGcd[end--]);
       }
    return ans;
    }
    public int findGCD(int num1, int num2){
        if(num2==0) return num1;
    return findGCD(num2, num1%num2);
    }
}