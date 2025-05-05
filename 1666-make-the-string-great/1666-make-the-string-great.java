class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(st.isEmpty()) st.push(s.charAt(i));
            else{
            char ch = st.peek();
            char curr = s.charAt(i);
            if( curr>='A' && curr<='Z' && Character.toLowerCase(curr)==ch || curr>='a' && curr<='z' && Character.toUpperCase(curr)==ch) st.pop();
            else st.push(curr);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
    return sb.reverse().toString();
    }
}