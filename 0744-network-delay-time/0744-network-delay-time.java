class Pair{
    private int dis;
    private int node;
    public Pair(int dis, int node){
        this.dis=dis;
        this.node=node;
    }
    public int getDis(){
        return this.dis;
    }
    public int getNode(){
        return this.node;
    }
}
class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        int ans=0;
        Map<Integer,List<Pair>> map = new HashMap<>();
        for(int i=1;i<=n;i++) map.put(i, new ArrayList<Pair>());
        for(int i=0;i<times.length;i++){
            map.get(times[i][0]).add(new Pair(times[i][2],times[i][1]));
        }
        int[] distance = new int[n+1];
        Arrays.fill(distance, Integer.MAX_VALUE);
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> a.getDis()-b.getDis());
        distance[k] = 0;
        pq.add(new Pair(0,k));
        while(!pq.isEmpty()){
            Pair curr = pq.poll();
            int currDis = curr.getDis();
            int currNode = curr.getNode();
            if(currDis > distance[currNode]) continue;
                for(Pair t : map.get(currNode)){
                    int node = t.getNode();
                    int dis = t.getDis();
                    if(dis + currDis < distance[node]){
                        int newDis = dis + currDis;
                        distance[node] = newDis;
                        pq.add(new Pair(newDis,node));
                    }
                }
            }
        for(int i=1;i<=n;i++){
            if(distance[i]==Integer.MAX_VALUE) return -1;
            else ans = Math.max(ans, distance[i]);
        }
    return ans;
    }
}