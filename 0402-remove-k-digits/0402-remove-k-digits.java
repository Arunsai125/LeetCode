class Solution {
    public String removeKdigits(String num, int k) {
        if(k == num.length()) return "0";
        Stack<Character> st = new Stack<>();
        for(int i=0;i<num.length();i++){
            while(!st.isEmpty() && k>0 && st.peek()-'0' > num.charAt(i)-'0' ){
                st.pop();
                k--;
            }
        st.push(num.charAt(i));
        }
        while(!st.isEmpty() && k>0){
            k--;
            st.pop();
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        while(sb.length() > 0 && sb.charAt(sb.length()-1)=='0'){
            sb.setLength(sb.length()-1);
        }
    return sb.length()>0 ? sb.reverse().toString() : "0";
    }
}