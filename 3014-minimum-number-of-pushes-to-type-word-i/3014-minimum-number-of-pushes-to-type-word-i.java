class Solution {
    public int minimumPushes(String word) {
        if(word.length()<=8) return word.length();
        int[] array = new int[26];
        int unique = 0;
        for(int i=0;i<word.length();i++){
            array[word.charAt(i)-'a']++;
            if( array[word.charAt(i)-'a'] == 1) unique ++;
        }
        if(unique<=8) return word.length();
        int ans = 0;
        int count = 1;
        while(unique > 0){
            int remaining = unique >= 8 ? 8 : unique;
            unique -= remaining;
            ans += (remaining*count);
            count++;
        }
    return ans;
    }
}