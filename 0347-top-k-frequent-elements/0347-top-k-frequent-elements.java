class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums) map.put(i, map.getOrDefault(i,0)+1);
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));
        pq.addAll(map.keySet());
        int[] ans = new int[k];
        int ptr=0;
        while(k!=0){
            ans[ptr++] = pq.poll();
            k--;
        }
    return ans;
    }
}