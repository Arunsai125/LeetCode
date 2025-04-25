class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1 || numRows>=s.length()) return s;
        StringBuilder ans = new StringBuilder();
        StringBuilder[] arr = new StringBuilder[numRows];
        for(int i=0;i<numRows;i++){
            arr[i] = new StringBuilder();
        }
        boolean goingDown=false;
        int c=0;
        for(int i=0;i<s.length();i++){
            arr[c].append(s.charAt(i));
            if(c==0 || c==numRows-1) goingDown = !goingDown;
            c += goingDown ? 1 : -1;
        }
        for(StringBuilder sb : arr){
            ans.append(sb);
        }
    return ans.toString();
    }
}