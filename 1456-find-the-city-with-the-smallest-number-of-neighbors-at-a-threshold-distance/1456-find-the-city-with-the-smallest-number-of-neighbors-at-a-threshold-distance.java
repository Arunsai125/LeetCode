class Pair{
    int target;
    int weight;
    public Pair(int target, int weight){
        this.target=target; 
        this.weight=weight;
    }
}
class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int ans=-1;
        Map<Integer,List<Pair>> map = new HashMap<>();
        for(int i=0;i<n;i++) map.put(i, new ArrayList<Pair>());
        for(int[] edge : edges){
            map.get(edge[0]).add(new Pair(edge[1],edge[2]));
            map.get(edge[1]).add(new Pair(edge[0],edge[2]));
        }
        int maxNeighbours = n-1;
        for(int src=0;src<n;src++){
            int temp = DijkstraAlgo(src,map,distanceThreshold,n);
            if(temp<=maxNeighbours){
                ans = src;
                maxNeighbours = temp;
            }
        }
    return ans;
    }
    public int DijkstraAlgo(int src, Map<Integer,List<Pair>> map, int k, int n){
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> a.weight-b.weight);
        int[] dist = new int[n];
        Arrays.fill(dist,(int)1e9);
        dist[src]=0;
        pq.add(new Pair(src,0));
        while(!pq.isEmpty()){
            Pair temp = pq.poll();
            for(Pair p : map.get(temp.target)){
                int node = p.target;
                int dis = p.weight;
                if(dist[temp.target] + dis < dist[node]){
                    dist[node] = dist[temp.target] + dis;
                    pq.add(new Pair(node, dist[node]));
                }
            }
        }
        int c=0;
        for(int i=0;i<n;i++){
            if(i==src) continue;
            if(dist[i] <= k) c++;
        }
    return c;
    }
}