class Pair{
    int element;
    int frequency;
    public Pair(int element, int frequency){
        this.element=element;
        this.frequency=frequency;
    }
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> a.frequency - b.frequency);
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : nums) { 
            map.put(i, map.getOrDefault(i,0)+1);
        }
        for(int key : map.keySet()) {
            if(pq.size()>k) pq.poll();
            pq.add(new Pair(key, map.get(key)));
        }
        if(pq.size()>k) pq.poll();
        int[] ans = new int[k];
        int ptr=0;
        while(k!=0){
            k--;
            ans[ptr++] = pq.poll().element;
        }
    return ans;
    }
}