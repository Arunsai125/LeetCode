class Solution {
    public char kthCharacter(int k) {
        StringBuilder sb = new StringBuilder();
        sb.append("a");
        while(sb.length()<k){
            String gen = function(sb.toString());
            sb.append(gen);
        }
    return sb.charAt(k-1);
    }
    public String function(String ans){
        StringBuilder temp = new StringBuilder();
        for(int i=0;i<ans.length();i++){
            char ch = ans.charAt(i);
            if(ch=='z') temp.append("a");
            else temp.append("" + (char)(ch+1));
        }
    return temp.toString();
    }
}