class Solution {
    public int smallestNumber(int n) {
        int len = Integer.toBinaryString(n).length();
        int ans = 0;
        for(int i=0;i<len;i++) ans += Math.pow(2,i);
    return ans;
    }
}