class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] arr = new char[26];
        for(int i=0;i<magazine.length();i++){
            arr[magazine.charAt(i)-'a']++;
        }
        for(int i=0;i<ransomNote.length();i++){
            int val = ransomNote.charAt(i)-'a';
            if(arr[val]==0) return false;
            else arr[val]--;
        }
    return true;
    }
}