class Solution {
    public int maxDistance(String moves) {
        int x=0;
        int y=0;
        int c=0;
        for(int i=0;i<moves.length();i++){
            char ch = moves.charAt(i);
            if(ch=='U') x++;
            else if(ch=='D') x--;
            else if(ch=='L') y--;
            else if(ch=='R') y++;
            else c++;
        }
    return Math.abs(x) + Math.abs(y) + c;
    }
}