class Solution {
    public int maxDifference(String s) {
        int[] freq = new int[26];
        for(int i=0;i<s.length();i++) freq[s.charAt(i)-'a']++;
        int oddFreq = 0;
        int evenFreq = 100;
        for(int i=0;i<26;i++){
            if(freq[i]%2!=0) oddFreq = Math.max(oddFreq, freq[i]);
            if(freq[i]%2==0 && freq[i]!=0) evenFreq = Math.min(evenFreq, freq[i]);
        }
    return oddFreq - evenFreq;
    }
}