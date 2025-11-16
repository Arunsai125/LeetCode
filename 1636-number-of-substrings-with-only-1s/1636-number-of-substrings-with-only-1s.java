class Solution {
    public int numSub(String s) {
        int mod = 1000000007;
        int ans = 0;
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                ans++;
                if(count!=0) ans = (ans + count)%mod;
                count++;
            }
            else count=0;
        }
    return ans;
    }
}