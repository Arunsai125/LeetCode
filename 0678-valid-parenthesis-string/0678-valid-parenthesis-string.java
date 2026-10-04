class Solution {
    public boolean checkValidString(String s) {
        int start = 0;
        int end = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                start++;
                end++;
            }
            else if(s.charAt(i)==')'){
                start--;
                end--;
            }
            else{
                start = start-1;
                end = end+1;
            }
            if(start<0) start = 0;
            if(end<0) return false;
        }
    return start==0;
    }
}