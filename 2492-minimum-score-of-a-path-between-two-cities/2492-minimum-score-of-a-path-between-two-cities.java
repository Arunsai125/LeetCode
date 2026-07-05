class Pair{
    int city;
    int distance;
    public Pair(int city, int distance){
        this.city=city;
        this.distance=distance;
    }
}

class Solution {
    public int minScore(int n, int[][] roads) {
        List<List<Pair>> adjList = new ArrayList<>();
        for(int i=0;i<=n;i++) adjList.add(new ArrayList<>());
        for(int[] road : roads){
            int city1 = road[0];
            int city2 = road[1];
            int distance = road[2];
            adjList.get(city1).add(new Pair(city2, distance));
            adjList.get(city2).add(new Pair(city1, distance));
        }
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[n+1];
        q.add(1);
        visited[1] = true;
        int ans = Integer.MAX_VALUE;
        while(!q.isEmpty()){
            int top = q.poll();
            for(Pair cities : adjList.get(top)){
                int city = cities.city;
                int distance = cities.distance;
                ans = Math.min(ans, distance);
                if(!visited[city]){
                    visited[city] = true;
                    q.add(city);
                }
            }
        }
    return ans;
    }
}