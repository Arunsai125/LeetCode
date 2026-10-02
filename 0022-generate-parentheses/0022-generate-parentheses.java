class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        recursion(n, ans, 0, 0, "");
    return ans;
    }
    public void recursion(int length, List<String> ans, int left, int right, String str){
        if(str.length() == length*2){
            ans.add(str);
            return;
        }
        if(left<length){
            recursion(length, ans, left+1, right, str+ "(");
        }
        if(right<left){
            recursion(length, ans, left, right+1, str + ")");
        }
    }
}