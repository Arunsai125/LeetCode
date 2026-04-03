class Pair{
    public int eventId;
    public int priority;
    public int count;
    public Pair(int eventId, int priority, int count){
        this.eventId = eventId;
        this.priority = priority;
        this.count = count;
    }
}
class EventManager {
    private PriorityQueue<Pair> pq;
    public Map<Integer,Integer> map;
    public EventManager(int[][] events) {
        pq = new PriorityQueue<>((a,b) ->{
            if(a.priority == b.priority) return a.eventId - b.eventId;
            return b.priority - a.priority;
        });
        map = new HashMap<>();
        for(int[] event : events) {
            pq.offer(new Pair(event[0], event[1], 0));
            map.put(event[0], 0);
        }
    }
    
    public void updatePriority(int eventId, int newPriority) {
        int newCount = map.get(eventId)+1;
        map.put(eventId, newCount);
        pq.add(new Pair(eventId, newPriority, newCount));
    }
    public int pollHighest() {
        if(pq.isEmpty()) return -1;
        while(!pq.isEmpty()){
            Pair temp = pq.poll();
            int eventId = temp.eventId;
            int count = temp.count;
            if(count == map.get(eventId)) return eventId;
            else continue;
        }
    return -1;
    }
}

/**
 * Your EventManager object will be instantiated and called as such:
 * EventManager obj = new EventManager(events);
 * obj.updatePriority(eventId,newPriority);
 * int param_2 = obj.pollHighest();
 */