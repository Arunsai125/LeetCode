class Solution {
    public int makeConnected(int n, int[][] connections) {
        if(connections.length < n-1) return -1;
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        for(int[] con : connections){
            adj.get(con[0]).add(con[1]);
            adj.get(con[1]).add(con[0]);
        }
        boolean[] visited = new boolean[n];
        int totalCompo = 0;
        for(int i=0;i<n;i++){
            if(visited[i]==false){
                totalCompo++;
                visited[i]=true;
                bfs(adj,i,visited);
            }
        }
    return totalCompo-1;
    }
    public void bfs(List<List<Integer>> adj, int node, boolean[] visited){
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        while(!q.isEmpty()){
            int temp = q.poll();
            for(int val : adj.get(temp)){
                if(visited[val]==false){
                    visited[val]=true;
                    q.add(val);
                }
            }
        }
    }
}