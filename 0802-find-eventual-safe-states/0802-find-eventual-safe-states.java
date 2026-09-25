class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        boolean[] vis = new boolean[n];
        boolean[] pathVis = new boolean[n];
        boolean[] safeNodes = new boolean[n];
        for(int i=0;i<n;i++){
            if(!vis[i]) dfs(i,vis,pathVis,safeNodes,graph);
        }
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(safeNodes[i]) ans.add(i);
        }
    return ans;
    }
    public boolean dfs(int node, boolean[] vis, boolean[] pathVis, boolean[] safeNodes, int[][] graph){
        vis[node] = true;
        pathVis[node] = true;
        for(int nbr : graph[node]){
            if(!vis[nbr]){ if(dfs(nbr,vis,pathVis,safeNodes,graph)) return true; }
            else if(pathVis[nbr]) return true;
        }
        safeNodes[node] = true;
        pathVis[node] = false;
    return false;
    }
}