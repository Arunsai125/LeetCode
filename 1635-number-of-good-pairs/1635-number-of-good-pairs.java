class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int ans=0;
        for(int i : nums){
            if(map.containsKey(i)) ans += map.get(i);
        map.put(i, map.getOrDefault(i,0)+1);
        }
    return ans;
    }
}