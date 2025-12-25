class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        long ans = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);
        for(int val : happiness) pq.add(val);
        int c = 0;
        ans += (long) pq.poll();
        k--;
        c++;
        while(k!=0){
            if(pq.peek() - c <= 0 ) return ans;
            ans += (long) (pq.poll() - c);
            c++;
            k--;
        }
    return ans;
    }
}