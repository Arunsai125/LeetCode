class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int[] freq = new int[101];
        for(int i : nums) freq[i]++;
        int ans = 0;
        for(int i=1;i<=100;i++){
            if(freq[i]%k==0) ans += i*freq[i];
        }
    return ans;
    }
}