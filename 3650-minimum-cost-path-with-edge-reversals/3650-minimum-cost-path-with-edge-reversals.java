class Pair{
    int weight;
    int node;
    public Pair(int weight, int node){
        this.weight=weight;
        this.node=node;
    }
}


class Solution {
    public int minCost(int n, int[][] edges) {
        List<List<Pair>> adjList = new ArrayList<>();
        for(int i=0;i<n;i++) adjList.add(new ArrayList<Pair>());
        for(int i=0;i<edges.length;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            int w = edges[i][2];
            adjList.get(u).add(new Pair(w, v));
            adjList.get(v).add(new Pair(2*w, u));
        }
        int[] distance = new int[n];
        Arrays.fill(distance, Integer.MAX_VALUE);
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> a.weight - b.weight);
        distance[0] = 0;
        pq.add(new Pair(0,0));
        while(!pq.isEmpty()){
            Pair temp = pq.poll();
            if(temp.node == n-1) return distance[temp.node];
            for(Pair adj : adjList.get(temp.node)){
                if(distance[temp.node] + adj.weight < distance[adj.node]){
                    distance[adj.node] = distance[temp.node] + adj.weight;
                    pq.add(new Pair(distance[adj.node], adj.node));
                }
            }
        }
    return -1;
    }
}