class Solution {
    public String interpret(String command) {
        StringBuilder ans = new StringBuilder();
        int ind=0;
        while(ind<command.length()){
            char ch = command.charAt(ind);
            if(ch=='G') {
                ans.append("G");
                ind++;
            }
            else if(ch=='(' && command.charAt(ind+1)=='a'){
                ans.append("al");
                ind += 4;
            }
            else{
                ans.append("o");
                ind+=2;
            }
        }
    return ans.toString();
    }
}