class Solution {
    public int minMaxDifference(int num) {
        String str = String.valueOf(num);
        char largerChar = '0';
        char smallerChar = '0';
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!='9'){
                smallerChar = str.charAt(i);
                break;
            }
        }
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!='0'){
                largerChar = str.charAt(i);
                break;
            }
        }
        StringBuilder smallerNumber = new StringBuilder();
        StringBuilder largerNumber = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch!=largerChar) smallerNumber.append(ch);
            else smallerNumber.append('0');
        }
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch!=smallerChar) largerNumber.append(ch);
            else largerNumber.append('9');
        }
    return Integer.valueOf(String.valueOf(largerNumber)) - Integer.valueOf(String.valueOf(smallerNumber));
    }
}