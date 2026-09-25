class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<List<Integer>> adjList = new ArrayList<>();
        int n = graph.length;
        for(int i=0;i<n;i++) adjList.add(new ArrayList<>());
        int[] indegree = new int[n];
        for(int i=0;i<n;i++){
            for(int nbr : graph[i]){
                adjList.get(nbr).add(i);
                indegree[i]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<indegree.length;i++){
            if(indegree[i]==0) q.add(i);
        }
        List<Integer> ans = new ArrayList<>();
        while(!q.isEmpty()){
            int top = q.poll();
            ans.add(top);
            for(int nbr : adjList.get(top)){
                indegree[nbr]--;
                if(indegree[nbr]==0) q.add(nbr);
            }
        }
        Collections.sort(ans);
    return ans;
    }
}