class Pair{
    int uid;
    int tid;
    int p;
    public Pair(int uid, int tid, int p){
        this.uid=uid;
        this.tid=tid;
        this.p=p;
    }
}

class TaskManager {
    PriorityQueue<Pair> pq;
    Map<Integer, Pair> map;

    public TaskManager(List<List<Integer>> tasks) {
        map = new HashMap<>();
        pq = new PriorityQueue<>((a,b) -> {
            if (a.p == b.p) return Integer.compare(b.tid, a.tid); // tid desc
            return Integer.compare(b.p, a.p);                      // priority desc
        });
        for (int i = 0; i < tasks.size(); i++) {
            Pair temp = new Pair(tasks.get(i).get(0), tasks.get(i).get(1), tasks.get(i).get(2));
            pq.add(temp);
            map.put(tasks.get(i).get(1), temp);
        }
    }

    public void add(int userId, int taskId, int priority) {
        Pair temp = new Pair(userId, taskId, priority);
        pq.add(temp);
        map.put(taskId, temp);
    }

    public void edit(int taskId, int newPriority) {
        Pair target = map.get(taskId);
        if (target == null) return;           // defensive (problem guarantees existence)
        Pair updated = new Pair(target.uid, taskId, newPriority);
        // Do NOT remove from pq (O(n)). Just push new version:
        pq.add(updated);
        map.put(taskId, updated);
    }

    public void rmv(int taskId) {
        // Do NOT remove from pq. Just drop from map so heap entries become stale.
        map.remove(taskId);
    }

    public int execTop() {
        while (!pq.isEmpty()) {
            Pair top = pq.peek();
            Pair cur = map.get(top.tid);
            // If task is removed or outdated (priority changed), discard heap entry.
            if (cur == null || cur.p != top.p || cur.uid != top.uid) {
                pq.poll();
                continue;
            }
            // Valid, current entry:
            pq.poll();
            map.remove(top.tid);
            return top.uid;
        }
        return -1;
    }
}
