class Solution {
    public int maxFreqSum(String s) {
        int[] freq = new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        int maxVowelCount=0;
        int maxConsonentCount=0;
        for(int i=0;i<26;i++){
            if(i==0 || i==4 || i==8 || i==14 ||i==20)  maxVowelCount = Math.max( maxVowelCount, freq[i]);
            else maxConsonentCount = Math.max(maxConsonentCount, freq[i]);
        }
    return maxConsonentCount + maxVowelCount;
    }
}