class Solution {
    public int countSubstrings(String s) {
        int ans = s.length();
        for(int i=0;i<s.length()-1;i++){
            for(int j=i+1;j<s.length();j++){
                if(isPalindromic(s.substring(i,j+1))) ans++;
            }
        }
    return ans;
    }
    public boolean isPalindromic(String str){
        int s=0;
        int e=str.length()-1;
        while(s<=e){
            if(str.charAt(s)!=str.charAt(e)) return false;
            else{
                s++;
                e--;
            }
        }
    return true;
    }
}