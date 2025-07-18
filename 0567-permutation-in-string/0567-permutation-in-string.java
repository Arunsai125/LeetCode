class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] arr1 = new int[26];
        for(int i=0;i<s1.length();i++) arr1[s1.charAt(i)-'a']++;
        for(int i=0;i<=s2.length()-s1.length();i++){
            int[] arr2 = new int[26];
            for(int j=i;j<i+s1.length();j++) arr2[s2.charAt(j)-'a']++;
            if(areArraysEqual(arr1,arr2)) return true;
        }
    return false;
    }
    public boolean areArraysEqual(int[] arr1, int[] arr2){
        for(int i=0;i<26;i++){
            if(arr1[i]!=arr2[i]) return false;
        }
    return true;
    }
}