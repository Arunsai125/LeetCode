class Solution {
    private int timer = 1;
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        List<List<Integer>> ans = new ArrayList<>();
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        for(List<Integer> temp : connections){
            adj.get(temp.get(0)).add(temp.get(1));
            adj.get(temp.get(1)).add(temp.get(0));
        }
        int[] visited = new int[n];
        int[] time = new int[n];
        int[] low = new int[n];
        dfs(0,-1,visited, time, low, adj, ans);
    return ans;
    }
    public void dfs(int node, int parent, int[] vis, int[] time, int[] low, List<List<Integer>> adj,  List<List<Integer>> ans){
        vis[node]=1;
        time[node]=low[node]=timer;
        timer++;
        for(int nebr : adj.get(node)){
            if(nebr==parent) continue;
            if(vis[nebr]==0){
                dfs(nebr, node, vis, time, low, adj, ans);
                low[node] = Math.min(low[node], low[nebr]);
                if(low[nebr] > time[node]){
                    ans.add(Arrays.asList(node, nebr));
                }
            }
            else{
                low[node] = Math.min(low[node], low[nebr]);
            }
        }
    }
}