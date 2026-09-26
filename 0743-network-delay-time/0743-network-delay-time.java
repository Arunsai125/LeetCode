class Pair{
    int node;
    int weight;
    public Pair(int node, int weight){
        this.node=node;
        this.weight=weight;
    }
}

class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<Pair>> list = new ArrayList<>();
        for(int i=0;i<n+1;i++) list.add(new ArrayList<>());
        for(int[] time : times){
            list.get(time[0]).add(new Pair(time[1], time[2]));
        }
        int[] distance = new int[n+1];
        Arrays.fill(distance, Integer.MAX_VALUE);
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> a.weight - b.weight);
        pq.add(new Pair(k,0));
        distance[k]=0;
        while(!pq.isEmpty()){
            Pair top = pq.poll();
            int node = top.node;
            int dist = top.weight;
            for(Pair nbr : list.get(node)){
                int nbrNode = nbr.node;
                int nbrDist = nbr.weight;
                if(dist + nbrDist < distance[nbrNode]){
                    distance[nbrNode] = dist + nbrDist;
                    pq.add(new Pair(nbrNode, distance[nbrNode]));
                }
            }
        }
        int ans = -1;
        for(int i=1;i<distance.length;i++){
            if(distance[i]==Integer.MAX_VALUE) return -1;
            ans = Math.max(ans, distance[i]);
        }
    return ans;
    }
}