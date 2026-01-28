class Pair{
    int distance;
    int node;
    public Pair(int distance, int node){
        this.distance = distance;
        this.node = node;
    }
}

class Solution {
    public int minCost(int n, int[][] edges) {
        List<List<Pair>> list = new ArrayList<>();
        for(int i=0;i<n;i++) list.add(new ArrayList<Pair>());
        for(int i=0;i<edges.length;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            int w = edges[i][2];
            list.get(u).add(new Pair(w,v));
            list.get(v).add(new Pair(2*w,u));
        }
        int[] distance = new int[n];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[0] = 0;
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> a.distance - b.distance);
        pq.add(new Pair(0,0));
        while(!pq.isEmpty()){
            Pair temp = pq.poll();
            if(temp.node == n-1) return distance[temp.node];
            if (temp.distance != distance[temp.node]) continue;
            for(Pair p : list.get(temp.node)){
                int v = p.node;
                int w = p.distance;
                if(distance[temp.node] + w < distance[v]) {
                    distance[v] = distance[temp.node] + w ;
                    pq.add(new Pair(distance[v], v));
                }
            }
        }
    return -1;
    }
}