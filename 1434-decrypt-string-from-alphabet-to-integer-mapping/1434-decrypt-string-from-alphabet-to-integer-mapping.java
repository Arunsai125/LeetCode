class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        int start=0;
        while(start<s.length()){
            if(start+2<s.length() && s.charAt(start+2)=='#'){
                int num = Integer.valueOf(s.substring(start,start+2)) + 96;
                sb.append((char)num);
                start += 3;
            }
            else{
                int num = (s.charAt(start) - '0') + 96;
                sb.append((char)num);
                start++;
            }
        }
    return sb.toString();
    }
}