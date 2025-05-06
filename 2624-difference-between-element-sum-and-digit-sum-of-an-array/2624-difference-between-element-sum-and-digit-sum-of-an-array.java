class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int digitSum=0;
        for(int i : nums){
            sum += i;
            digitSum += calculateDigitSum(i);
        }
    return Math.abs(sum - digitSum);
    }
    public int calculateDigitSum(int num){
        int ans=0;
        while(num!=0){
            int d = num%10;
            ans += d;
            num/=10;
        }
    return ans;
    }
}