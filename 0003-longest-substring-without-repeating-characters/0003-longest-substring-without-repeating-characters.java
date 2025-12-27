class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 1;
        int left=0;
        Set<Character> set = new HashSet<>();
        set.add(s.charAt(0));
        for(int i=1;i<s.length();i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(i));
            ans = Math.max(ans, i-left+1);
        }
    return ans;
    }
}