class Solution {
    public int characterReplacement(String s, int k) {
        int ans = 0;
        for(int i=0;i<26;i++){
            char ch = (char) (i + 'A');
            int left = 0;
            int count = 0;
            for(int right=0;right<s.length();right++){
                char temp = s.charAt(right);
                if(temp != ch) {
                    count++;
                }
                while(count > k){
                    if (s.charAt(left) != ch) {
                        count--;
                    }
                    left++;
                }
                ans = Math.max(ans, right-left+1);
            }
        }
    return ans;
    }
}