class Solution {
    public String largestPalindromic(String num) {
        int[] freq = new int[10];
        for(char ch : num.toCharArray()){
            int temp = (ch - '0');
            freq[temp]++;
        }
        if(freq[0]==num.length()) return "0";
        StringBuilder sb1 = new StringBuilder();
        for(int i=9;i>=0;i--){
            if(freq[i] == num.length()) return num;
            if(freq[i] >= 2){
                int k = freq[i]/2;
                for(int j=0;j<k;j++) sb1.append(i);
                freq[i] = freq[i] - (2*k);
            }
        }
        while(sb1.length() > 0 && sb1.charAt(0)=='0'){
            sb1.deleteCharAt(0);
        }
        char middleChar = 'a';
        for(int i=9;i>=0;i--){
            if(freq[i]>0) {
                middleChar = (char) (i + '0');
                break;
            }
        }
         String sb2 = new StringBuilder(sb1).reverse().toString();
        if( middleChar == 'a') return sb1.toString() + sb2;
        if(sb1.length()==0) return String.valueOf(middleChar);
    return sb1.toString() + middleChar + sb2;
    }
}