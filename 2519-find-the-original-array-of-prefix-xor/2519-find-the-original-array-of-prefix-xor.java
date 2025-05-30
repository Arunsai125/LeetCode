class Solution {
    public int[] findArray(int[] pref) {
        int[] ans = new int[pref.length];
        ans[0] = pref[0];
        int xor = pref[0];
        for(int i=1;i<pref.length;i++){
            ans[i] = pref[i] ^ xor;
            xor ^= ans[i];
        }
    return ans;
    }
}