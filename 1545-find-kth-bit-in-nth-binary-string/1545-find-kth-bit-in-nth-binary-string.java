class Solution {
    public char findKthBit(int n, int k) {
        String str = generateString(n);
        if(n==1) return '0';
    return str.charAt(k-1);
    }
    public String generateString(int n){
        StringBuilder ans = new StringBuilder();
        ans.append("0");
        while(n > 1){
            n--;
            ans.append("1");
            ans.append(reverseAndInvert( new StringBuilder((ans.substring(0,ans.length()-1))) ));
        }
    return ans.toString();
    }
    public StringBuilder reverseAndInvert(StringBuilder sb){
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='0') sb.setCharAt(i,'1');
            else sb.setCharAt(i,'0');
        }
        return sb.reverse();
    }
}