class Solution {
    public int minimumDeletions(String word, int k) {
        int[] freq = new int[26];
        for(int i=0;i<word.length();i++) freq[word.charAt(i)-'a']++;
        int res = Integer.MAX_VALUE;
        for(int i=0;i<26;i++){
            int ans=0;
            for(int j=0;j<26;j++){
                if(i==j || freq[j]==0) continue;
                else if(freq[j] < freq[i]) ans += freq[j];
                else if(freq[j] > freq[i]+k) { 
                    int diff = freq[j]-freq[i]-k;
                    ans += diff;
                }
            }
            res = Math.min(res,ans);
        }
    return res;
    }
}