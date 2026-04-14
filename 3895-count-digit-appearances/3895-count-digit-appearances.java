class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int ans = 0;
        for(int i : nums){
            ans += countOccurencesOfDigit(i,digit);
        }
    return ans;
    }
    public int countOccurencesOfDigit(int num, int digit){
        int ans = 0;
        while(num != 0){
            int d = num%10;
            if(d==digit) ans++;
            num /= 10;
        }
    return ans;
    }
}