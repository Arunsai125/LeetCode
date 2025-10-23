class Solution {
    public boolean hasSameDigits(String s) {
        StringBuilder sb = new StringBuilder(s);
        while(sb.length()>2){
            StringBuilder temp = new StringBuilder();
            for(int i=1;i<sb.length();i++){
                int val = ((sb.charAt(i-1) - '0') + (sb.charAt(i) - '0')) % 10;
                temp.append(val);
            }
            sb = temp;
        }
    return sb.charAt(0) == sb.charAt(1);
    }
}