class Solution {
    public int totalWaviness(int num1, int num2) {
        int ans=0;
        for(int i=num1;i<=num2;i++){
            ans += countPeakAndValley(i);
        }
    return ans;
    }
    public int countPeakAndValley(int num){
        if(num<100) return 0;
        int ans=0;
        String str = String.valueOf(num);
        for(int i=1;i<str.length()-1;i++){
            if(str.charAt(i)-'0' > str.charAt(i-1)-'0' && str.charAt(i)-'0' > str.charAt(i+1)-'0') ans++;
            else if(str.charAt(i)-'0' < str.charAt(i-1)-'0' && str.charAt(i)-'0' < str.charAt(i+1)-'0') ans++;
            else continue;
        }
    return ans;
    }
}