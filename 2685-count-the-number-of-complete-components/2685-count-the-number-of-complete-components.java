class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        boolean[] visited = new boolean[n];
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<n;i++) list.add(new ArrayList<>());
        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            list.get(u).add(v);
            list.get(v).add(u);
        }
        int ans=0;
        for(int i=0;i<n;i++){
            if(!visited[i]){
                if(isCompleteComponent(i,list,visited)) ans++;
            }
        }
    return ans;
    }
    public boolean isCompleteComponent(int node, List<List<Integer>> list, boolean[] visited){
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        int vertices = 0;
        int edges = 0;
        while(!q.isEmpty()){
            int top = q.poll();
            visited[top] = true;
            vertices++;
            edges += list.get(top).size();
            for(int nbr : list.get(top)){
                if(!visited[nbr]){
                    visited[nbr] = true;
                    q.add(nbr);
                }
            }
        }
        edges /= 2;
    return edges == (vertices * (vertices-1)) / 2;
    }
}