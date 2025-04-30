class Solution {
    public int balancedStringSplit(String s) {
        int ans=0;
        int rCount=0;
        int lCount=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='L') lCount++;
            else rCount++;
            if(lCount==rCount){
                ans++;
                lCount=0;
                rCount=0;
            }
        }
    return ans;
    }
}