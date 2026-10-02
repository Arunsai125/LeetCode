class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] chars = new int[256];
        int ans=0;
        int left=0;
        for(int right=0;right<s.length();right++){
            char ch = s.charAt(right);
            while(chars[ch] > 0){
                chars[s.charAt(left)] = 0;
                left++;
            }
            chars[ch]++;
            ans = Math.max(ans, right-left+1);
        }
    return ans;
    }
}