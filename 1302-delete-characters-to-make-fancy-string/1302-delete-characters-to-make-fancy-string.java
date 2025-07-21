class Solution {
    public String makeFancyString(String s) {
        if(s.length()<=2) return s;
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        sb.append(s.charAt(1));
        for(int i=2;i<s.length();i++){
            char ch = s.charAt(i);
            char ch1 = sb.charAt(sb.length()-1);
            char ch2 = sb.charAt(sb.length()-2);
            if(ch==ch1 && ch==ch2) continue;
            else sb.append(ch);
        }
    return sb.toString();
    }
}