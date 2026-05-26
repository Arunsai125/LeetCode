class Solution {
    public int numberOfSpecialChars(String word) {
        int ans = 0;
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if(ch>= 'a' && ch<='z') freq1[ch-'a']++;
            else freq2[ch-'A']++;
        }
        for(int i=0;i<26;i++){
            if(freq1[i]>=1 && freq2[i]>=1) ans++;
        }
    return ans;
    }
}