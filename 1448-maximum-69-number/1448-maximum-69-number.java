class Solution {
    public int maximum69Number (int num) {
        int c=0;
        String str = String.valueOf(num);
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(c==0){
                if(str.charAt(i)=='6'){
                    c++;
                    ans.append('9');
                }
                else{
                    ans.append('9');
                }
            }
            else{
                ans.append(str.charAt(i));
            }
        }
    return Integer.valueOf(ans.toString());
    }
}