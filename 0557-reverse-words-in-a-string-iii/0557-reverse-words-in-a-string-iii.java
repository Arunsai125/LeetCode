class Solution {
    public String reverseWords(String str) {
        StringBuilder ans = new StringBuilder();
        int s=0;
        int e=0;
        while(e<str.length()){
            if(str.charAt(e)==' '){
                StringBuilder sb = new StringBuilder(str.substring(s,e)).reverse();
                ans.append(sb);
                ans.append(' ');
                s = e+1;
            }
            e++;
        }
        StringBuilder sb = new StringBuilder(str.substring(s,e)).reverse();
        ans.append(sb);
    return ans.toString();
    }
}