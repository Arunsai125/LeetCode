class Solution {
    public int minElement(int[] nums) {
        int ans = Integer.MAX_VALUE;
        for(int num : nums){
            ans = Math.min(sumOfDigits(num), ans);
        }
    return ans;
    }
    public int sumOfDigits(int num){
        int ans=0;
        while(num>0){
            int d = num%10;
            ans += d;
            num /=10;
        }
    return ans;
    }
}