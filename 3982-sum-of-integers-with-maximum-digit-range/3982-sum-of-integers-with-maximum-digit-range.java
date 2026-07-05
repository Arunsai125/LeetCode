class Solution {
    public int maxDigitRange(int[] nums) {
        int maxRange = 0;
        int ans=0;
        for(int num : nums) maxRange = Math.max(maxRange, range(num));
        for(int num : nums) if(range(num) == maxRange) ans += num;
    return ans;
    }
    public int range(int num){
        int max = 0;
        int min = 9;
        while(num>0){
            int d = num%10;
            max = Math.max(max, d);
            min = Math.min(min, d);
            num = num/10;
        }
    return max-min;
    }
}