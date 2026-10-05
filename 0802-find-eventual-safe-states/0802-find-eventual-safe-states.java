class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        boolean[] vis = new boolean[n];
        boolean[] pathVis = new boolean[n];
        boolean[] safeNodes = new boolean[n];
        for(int i=0;i<n;i++){
            if(vis[i]==false){
                dfs(i, graph, vis, pathVis, safeNodes);
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(safeNodes[i]) ans.add(i);
        }
    return ans;
    }
    public boolean dfs(int node, int[][] graph, boolean[] vis, boolean[] pathVis, boolean[] safeNodes){
        vis[node] = true;
        pathVis[node] = true;
        for(int nbr : graph[node]){
            if(vis[nbr]==false){
                if(dfs(nbr, graph, vis, pathVis, safeNodes)) return true;
            }
            if(pathVis[nbr]) return true;
        }
        safeNodes[node] = true;
        pathVis[node] = false;
    return false;
    }
}