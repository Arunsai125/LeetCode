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
            if (a.p == b.p) return Integer.compare(b.tid, a.tid);
            return Integer.compare(b.p, a.p);                     
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
        if (target == null) return;           
        Pair updated = new Pair(target.uid, taskId, newPriority);
        pq.add(updated);
        map.put(taskId, updated);
    }

    public void rmv(int taskId) {
        map.remove(taskId);
    }

    public int execTop() {
        while (!pq.isEmpty()) {
            Pair top = pq.peek();
            Pair cur = map.get(top.tid);
            if (cur == null || cur.p != top.p || cur.uid != top.uid) {
                pq.poll();
                continue;
            }
            pq.poll();
            map.remove(top.tid);
            return top.uid;
        }
        return -1;
    }
}
