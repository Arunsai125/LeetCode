class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        long ans = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b) -> b-a);
        for(int i : nums) pq.add(i);
        while(k > 0){
            int top = pq.poll();
            ans += Math.max((long)top, (long)top * (long)mul);
            mul--;
            k--;
        }
    return ans;
    }
}