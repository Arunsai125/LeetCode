class Solution {
    public int passwordStrength(String password) {
        int ans = 0;
        Set<Character> set = new HashSet<>();
        for(int i=0;i<password.length();i++){
            char ch = password.charAt(i);
            if(set.contains(ch)) continue;
            if(ch>='a' && ch<='z'){
                set.add(ch);
                ans += 1;
            }
            else if(ch>='A' && ch<='Z'){
                set.add(ch);
                ans += 2;
            }
            else if(ch=='#' || ch=='@' || ch=='!' || ch=='$'){
                set.add(ch);
                ans += 5;
            }
            else{
                set.add(ch);
                ans += 3;
            }
        }
    return ans;
    }
}