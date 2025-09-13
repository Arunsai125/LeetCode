class Solution {
    public int maxFreqSum(String s) {
        int[] vowels = new int[26];
        int[] consonents = new int[26];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') vowels[ch-'a']++;
            else consonents[ch-'a'] ++;
        }
        int vowelCount = 0;
        int consonentCount = 0;
        for(int i=0;i<26;i++){
            vowelCount = Math.max(vowelCount, vowels[i]);
            consonentCount = Math.max(consonentCount, consonents[i]);
        }
    return vowelCount + consonentCount;
    }
}