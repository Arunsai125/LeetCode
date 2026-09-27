class Solution {
    public String reverseParentheses(String s) {
        Deque<Integer> stack = new LinkedList<>();
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.push(ans.length());
            }
            else if(s.charAt(i)==')'){
                int startIndex = stack.pop();
                String reversed = new StringBuilder(ans.substring(startIndex)).reverse().toString();
                ans.replace(startIndex,ans.length(), reversed);
            }
            else ans.append(s.charAt(i));
        }
    return ans.toString();
    }
}