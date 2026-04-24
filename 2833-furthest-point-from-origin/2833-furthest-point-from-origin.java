class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int left=0;
        int right=0;
        int ans=0;
        int temp=0;
        for(char ch : moves.toCharArray()){
            if(ch=='L') temp--;
            else temp++;
        }
        ans = Math.max(ans, Math.abs(temp));
        temp=0;
        for(char ch : moves.toCharArray()){
            if(ch=='R') temp++;
            else temp--;
        }
        ans = Math.max(ans, Math.abs(temp));
    return ans;
    }
}