class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        String[] letters = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        recursion(digits, 0, sb, letters, ans);
    return ans;
    }
    public void recursion(String digits, int index, StringBuilder sb, String[] letters, List<String> ans){
        if(index==digits.length()){
            ans.add(sb.toString());
            return;
        }
        String current = letters[(digits.charAt(index)-'0')-2];
        for(int i=0;i<current.length();i++){
            sb.append(current.charAt(i));
            recursion(digits, index+1, sb, letters, ans);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}