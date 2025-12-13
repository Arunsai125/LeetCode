class Solution {
    public int countCoveredBuildings(int n, int[][] buildings) {
        Map<Integer,Integer> minXMap = new HashMap<>();
        Map<Integer,Integer> maxXMap = new HashMap<>();
        Map<Integer,Integer> maxYMap = new HashMap<>();
        Map<Integer,Integer> minYMap = new HashMap<>();
        for(int[] building : buildings){
            int x = building[0];
            int y = building[1];
            if(!minXMap.containsKey(x)){
                minXMap.put(x,y);
                maxXMap.put(x,y);
            }
            if(!minYMap.containsKey(y)){
                minYMap.put(y,x);
                maxYMap.put(y,x);
            }
            minXMap.put(x, Math.min(minXMap.get(x),y));
            maxXMap.put(x, Math.max(maxXMap.get(x),y));
            minYMap.put(y, Math.min(minYMap.get(y),x));
            maxYMap.put(y, Math.max(maxYMap.get(y),x));
        }
        int ans = 0;
        for(int[] building : buildings){
            int x = building[0];
            int y = building[1];
            if(minXMap.get(x) < y && maxXMap.get(x) > y && minYMap.get(y) < x && maxYMap.get(y) > x) ans++;
        }
    return ans;
    }
}