class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        List<List<Integer>> adjList = new ArrayList<>();
        for(int i=0;i<n;i++){
            adjList.add(new ArrayList<>());
        }
        for(int j=0;j<n;j++){
            for(int i=0;i<n;i++){
                if(i==j) continue;
                if(isConnected[i][j]==1) adjList.get(j).add(i);
            }
        }
        boolean[] visited = new boolean[n];
        int ans = 0;
        for(int i=0;i<n;i++){
            if(visited[i]==false){
                ans++;
                visited[i] = true;
                bfs(i,adjList,visited);
            }
        }
    return ans;
    }
    public void bfs(int node, List<List<Integer>> adjList, boolean[] visited){
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        while(!q.isEmpty()){
            int top = q.poll();
            for(int adj : adjList.get(top)){
                if(visited[adj] == false){
                    visited[adj] = true;
                    q.add(adj);
                }
            }
        }
    }
}