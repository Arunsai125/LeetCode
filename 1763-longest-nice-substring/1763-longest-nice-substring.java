class Solution {
    public String longestNiceSubstring(String s) {
        String ans = "";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String str = s.substring(i,j);
                if(isNiceSubstring(str)){
                    if(str.length() > ans.length()){
                        ans = str;
                    }
                }
            }
        }
    return ans;
    }
    public boolean isNiceSubstring(String str){
        if(str.length()==1) return false;
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isLowerCase(ch)) arr1[ch-'a']++;
            else arr2[ch-'A']++;
        }
        for(int i=0;i<26;i++){
            if( (arr1[i]!=0 && arr2[i]==0) || (arr1[i]==0 && arr2[i]!=0)) return false;
        }
    return true;
    }
}