class Solution {
    public int generateKey(int num1, int num2, int num3) {
        StringBuilder sb1 = new StringBuilder(String.valueOf(num1));
        if(sb1.length()<4) enLarge(sb1, 4-sb1.length());
        StringBuilder sb2 = new StringBuilder(String.valueOf(num2));
        if(sb2.length()<4) enLarge(sb2, 4-sb2.length());
        StringBuilder sb3 = new StringBuilder(String.valueOf(num3));
        if(sb3.length()<4) enLarge(sb3, 4-sb3.length());
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<4;i++){
            int min = Math.min(sb1.charAt(i)-'0',sb2.charAt(i)-'0');
            min = Math.min(min, sb3.charAt(i)-'0');
        ans.append(min);
        }
    return Integer.valueOf(ans.toString());
    }
    public StringBuilder enLarge(StringBuilder sb, int len){
        for(int i=0;i<len;i++) sb.insert(0,'0');
    return sb;
    }
}