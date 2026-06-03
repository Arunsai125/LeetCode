class Solution {
    public int digitFrequencyScore(int n) {
        int[] freq = new int[10];
        while(n>0){
            int d = n%10;
            freq[d]++;
            n /= 10;
        }
        int ans = 0;
        for(int i=1;i<=9;i++){
            ans += (i*freq[i]);
        }
    return ans;
    }
}