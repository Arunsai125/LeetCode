class Solution {
    public String decodeString(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch==']'){
                StringBuilder str = new StringBuilder();
                StringBuilder freq = new StringBuilder();
                while(!st.isEmpty() && st.peek()!='[') str.insert(0, st.pop());
                st.pop();
                while(!st.isEmpty() && Character.isDigit(st.peek())) freq.insert(0, st.pop());
                String newString = str.toString().repeat(Integer.valueOf(freq.toString()));
                for(int j=0;j<newString.length();j++) st.add(newString.charAt(j));
            }
            else st.add(ch);
        }
        while(!st.isEmpty()) ans.insert(0, st.pop());
    return ans.toString();
    }
}