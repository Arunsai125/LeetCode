class Solution {
    public int[] decode(int[] encoded, int first) {
        int[] ans = new int[encoded.length+1];
        ans[0] = first;
        for(int i=1;i<ans.length;i++){
            int prev = ans[i-1];
            int xorredValue = encoded[i-1];
            ans[i] = prev ^ xorredValue;
        }
    return ans;
    }
}