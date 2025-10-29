class Solution {
    public int smallestNumber(int n) {
        int bits = Integer.toBinaryString(n).length();
        int ans = 0;
        for(int i=0;i<bits;i++){
            ans += (int) Math.pow(2,i);
        }
    return ans;
    }
}