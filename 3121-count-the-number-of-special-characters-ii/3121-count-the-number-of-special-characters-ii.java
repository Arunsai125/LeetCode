class Solution {
    public int numberOfSpecialChars(String word) {
        int ans = 0;
        int[] small = new int[26];
        int[] large = new int[26];
        Arrays.fill(small, -1);
        Arrays.fill(large, -1);
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if(ch>='a' && ch<='z') {
                if(small[ch-'a'] == -2) continue; 
                if(large[ch-'a'] != -1){
                    small[ch-'a'] = -2;
                    continue;
                }
                small[ch-'a'] = i;
            }
            else large[ch-'A'] = i;
        }
        for(int i=0;i<26;i++){
            if(small[i] == -2) continue; 
            if(small[i]!=-1 && large[i]!=-1 && large[i] > small[i]) ans++;
        }
    return ans;
    }
}