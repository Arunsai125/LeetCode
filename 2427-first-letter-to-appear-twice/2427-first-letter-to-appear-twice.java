class Solution {
    public char repeatedCharacter(String s) {
        int[] arr = new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
            if(arr[s.charAt(i)-'a']==2) return s.charAt(i);
        }
    return 'a';
    }
}