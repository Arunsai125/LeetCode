class Packet {
    int source, destination, timestamp;
    public Packet(int s, int d, int t) {
        source = s;
        destination = d;
        timestamp = t;
    }
}

class Router {
    int memoryLimit;
    Queue<Packet> q;
    HashSet<Long> dupKey;
    HashMap<Integer, ArrayList<Integer>> desToTime;
    public Router(int memoryLimit) {
        this.memoryLimit = memoryLimit;
        q = new LinkedList<>();
        dupKey = new HashSet<>();
        desToTime = new HashMap<>();
    }
    private long makeKey(int s, int d, int t) {
        return (long)s * 10000000000L + (long)d * 100000 + t;
    }

    public boolean addPacket(int source, int destination, int timestamp) {
        long key = makeKey(source, destination, timestamp);
        if (dupKey.contains(key)) return false;

        if (q.size() == memoryLimit) {
            Packet old = q.poll();
            long oldKey = makeKey(old.source, old.destination, old.timestamp);
            dupKey.remove(oldKey);

            ArrayList<Integer> list = desToTime.get(old.destination);
            list.remove(0); 
            if (list.isEmpty()) desToTime.remove(old.destination);
        }

        Packet p = new Packet(source, destination, timestamp);
        q.add(p);
        dupKey.add(key);
        desToTime.putIfAbsent(destination, new ArrayList<>());
        desToTime.get(destination).add(timestamp);
        return true;
    }

    public int[] forwardPacket() {
        if (q.isEmpty()) return new int[0];
        Packet p = q.poll();

        long key = makeKey(p.source, p.destination, p.timestamp);
        dupKey.remove(key);

        ArrayList<Integer> list = desToTime.get(p.destination);
        list.remove(0);
        if (list.isEmpty()) desToTime.remove(p.destination);

        return new int[]{p.source, p.destination, p.timestamp};
    }
    public int getCount(int destination, int startTime, int endTime) {
        if (!desToTime.containsKey(destination)) return 0;
        ArrayList<Integer> list = desToTime.get(destination);

        int left = lowerBound(list, startTime);
        int right = upperBound(list, endTime);
        return right - left;
    }

    private int lowerBound(ArrayList<Integer> list, int target) {
        int l = 0, r = list.size();
        while (l < r) {
            int m = (l + r) / 2;
            if (list.get(m) >= target) r = m;
            else l = m + 1;
        }
        return l;
    }
    private int upperBound(ArrayList<Integer> list, int target) {
        int l = 0, r = list.size();
        while (l < r) {
            int m = (l + r) / 2;
            if (list.get(m) > target) r = m;
            else l = m + 1;
        }
        return l;
    }
}