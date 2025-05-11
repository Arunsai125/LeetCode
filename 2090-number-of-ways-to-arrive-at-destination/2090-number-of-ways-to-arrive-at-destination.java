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
    public int countPaths(int n, int[][] roads) {
        int mod = 1000000007;
        long[] distance = new long[n];
        Arrays.fill(distance, Long.MAX_VALUE);
        int[] ways = new int[n];
        Map<Integer,List<Pair>> map = new HashMap<>();
        for(int i=0;i<n;i++) map.put(i, new ArrayList<Pair>());
        for(int i=0;i<roads.length;i++){
            map.get(roads[i][0]).add(new Pair(roads[i][2],roads[i][1]));
            map.get(roads[i][1]).add(new Pair(roads[i][2],roads[i][0]));
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> a.getDis() - b.getDis());
        pq.add(new Pair(0,0));
        ways[0]=1;
        distance[0]=0;
        while(!pq.isEmpty()){
            Pair temp = pq.poll();
            long dis = temp.getDis();
            int node = temp.getNode();
            for(Pair p : map.get(node)){
                long newDis = p.getDis();
                int newNode = p.getNode();
                if(dis + newDis < distance[newNode]){
                    long k = dis+newDis;
                    pq.add(new Pair((int)k,newNode));
                    distance[newNode] = k;
                    ways[newNode] = ways[node];
                }
                else if(dis+newDis == distance[newNode]) ways[newNode] = (ways[newNode]+ways[node])%mod;
                else continue;
            }
        }
    return ways[n-1];
    }
}