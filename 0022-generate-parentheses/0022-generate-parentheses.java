class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
     recur(ans, 0, 0, "", n);
    return ans;
    }
    public void recur(List<String> ans, int left, int right, String s, int n){
        if(s.length()==n*2){
            ans.add(s);
            return;
        }
        if(left<n){
            recur(ans,left+1,right,s + "(",n);
        }
        if(right<left) recur(ans,left,right+1,s + ")",n);
    }
}