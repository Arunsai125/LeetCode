class Solution {
    public String removeDuplicateLetters(String s) {
        StringBuilder ans = new StringBuilder();
        int[] freq = new int[26];
        boolean[] visited = new boolean[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        ans.append(s.charAt(0));
        visited[s.charAt(0) - 'a'] = true;
        freq[s.charAt(0)-'a']--;
        for(int i=1;i<s.length();i++){
            char ch = s.charAt(i);
            if(visited[ch-'a']){
                freq[ch-'a']--;
                continue;
            } 
            else{
                while(ans.length()>0 && ans.charAt(ans.length()-1) > ch && freq[ans.charAt(ans.length()-1)-'a'] > 0){
                    visited[ans.charAt(ans.length()-1)-'a'] = false;
                    ans.deleteCharAt(ans.length()-1);
                }
                ans.append(ch);
                visited[ch-'a'] = true;
                freq[ch-'a']--;
            }
        }
    return ans.toString();
    }
}