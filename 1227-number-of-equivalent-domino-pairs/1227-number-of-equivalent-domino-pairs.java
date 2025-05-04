class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int ans=0;
        Map<String,Integer> map = new HashMap<>();
        for(int[] domino : dominoes){
            int a = domino[0];
            int b = domino[1];
            int min = Math.min(a,b), max = Math.max(a,b);
            String curr = String.valueOf(min) + String.valueOf(max);
            ans += map.getOrDefault(curr,0);
            map.put(curr, map.getOrDefault(curr,0)+1);
        }
    return ans;
    }
}