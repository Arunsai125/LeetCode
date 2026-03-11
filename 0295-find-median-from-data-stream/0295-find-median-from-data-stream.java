class MedianFinder {
    private PriorityQueue<Integer> minHeap;
    private PriorityQueue<Integer> maxHeap;
    public MedianFinder() {
        minHeap = new PriorityQueue<>((a,b) -> a-b);
        maxHeap = new PriorityQueue<>((a,b) -> b-a);
    }
    
    public void addNum(int num) {
        if(maxHeap.isEmpty() || num <= maxHeap.peek()) maxHeap.offer(num);
        else minHeap.offer(num);
        if(maxHeap.size() > minHeap.size() + 1) minHeap.offer(maxHeap.poll());
        if(minHeap.size() > maxHeap.size()) maxHeap.offer(minHeap.poll());
    }
    
    public double findMedian() {
        if(minHeap.size() == 0 && maxHeap.size() == 0) return 0.0;
        if(minHeap.size() == maxHeap.size()) return (double) (maxHeap.peek() + minHeap.peek())/2;
        return maxHeap.peek();
    }
}