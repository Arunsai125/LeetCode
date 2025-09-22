class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq = new int[101];
        int maxFreq = 0;
        for(int i : nums){
            freq[i]++;
            maxFreq = Math.max(maxFreq, freq[i]);
        }
        int ans=0;
        for(int i : freq){
            if(i == maxFreq) ans += i;
        }
    return ans;
    }
}