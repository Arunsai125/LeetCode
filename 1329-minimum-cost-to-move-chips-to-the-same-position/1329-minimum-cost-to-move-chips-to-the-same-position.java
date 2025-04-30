class Solution {
    public int minCostToMoveChips(int[] position) {
        int oddCount = 0;
        int evenCount=0;
        for(int i : position){
            if((i&1)==1) oddCount++;
            else evenCount++;
        }
        if(oddCount==evenCount) return oddCount;
        String s = oddCount>evenCount ? "odd" : "even";
        int ans=0;
        for(int i : position){
            if(s.equals("odd") && ((i&1)==0)) ans++;
            if(s.equals("even") && ((i&1)==1)) ans++;
        }
    return ans;
    }
}