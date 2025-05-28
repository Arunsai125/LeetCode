class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int[] mat : matrix){
            for(int i : mat){
                pq.add(i);
            }
        }
        while(k!=1){
            k--;
            pq.poll();
        }
        return pq.poll();
    }
}