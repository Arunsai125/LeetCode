class Solution {
    public int minCost(int[] startPos, int[] homePos, int[] rowCosts, int[] colCosts) {
        int ans=0;
        int x1=startPos[0], y1 = startPos[1];
        int x2=homePos[0], y2 = homePos[1];
        if(x2>x1){
            for(int i=x1+1;i<=x2;i++) ans += rowCosts[i];
        }
        else{
            for(int i=x1-1;i>=x2 ;i--) ans += rowCosts[i];
        }
        if(y2>y1){
            for(int i=y1+1;i<=y2;i++) ans += colCosts[i];
        }
        else{
            for(int i=y1-1;i>=y2;i--) ans += colCosts[i];
        }
    return ans;
    }
}