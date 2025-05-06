class Solution {
    public double minimumAverage(int[] nums) {
        PriorityQueue<Double> pq = new PriorityQueue<>();
        List<Integer> list = new ArrayList<>();
        for(int i : nums) list.add(i);
        Collections.sort(list);
        int target = nums.length/2;
        while(target!=0){
            target--;
            int smallest = list.get(0);
            int largest = list.get(list.size()-1);
            double avg = (smallest+largest)/2.0;
            list.remove(Integer.valueOf(smallest));
            list.remove(Integer.valueOf(largest));
            pq.add(avg);
        }
    return (double)pq.poll();
    }
}