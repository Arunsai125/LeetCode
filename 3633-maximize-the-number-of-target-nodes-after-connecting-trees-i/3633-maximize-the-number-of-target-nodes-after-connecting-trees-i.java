class Solution {
    public int[] maxTargetNodes(int[][] edges1, int[][] edges2, int k) {
        List<List<Integer>> adj1 = new ArrayList<>();
        List<List<Integer>> adj2 = new ArrayList<>();
        for(int i=0;i<edges1.length+1;i++) adj1.add(new ArrayList<>());
        for(int i=0;i<edges2.length+1;i++) adj2.add(new ArrayList<>());
        for(int [] edge : edges1)   { adj1.get(edge[0]).add(edge[1]); adj1.get(edge[1]).add(edge[0]); }
        for(int [] edge : edges2)   { adj2.get(edge[0]).add(edge[1]); adj2.get(edge[1]).add(edge[0]); }
        int[] ans1 = new int[edges1.length+1];
        int[] ans2 = new int[edges2.length+1];
        for(int i=0;i<ans1.length;i++){
            ans1[i] = function(adj1, i, k+1);
        }
        int add = 0;
        for(int i=0;i<ans2.length;i++){
            ans2[i] = function(adj2, i, k);
            add = Math.max(add, ans2[i]);
        }
        for(int i=0;i<ans1.length;i++) ans1[i] = ans1[i] + add;
    return ans1;
    }
    public int function(List<List<Integer>> adj, int start, int target){
        int ans=0;
        boolean[] visited = new boolean[adj.size()];
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;
        while(!q.isEmpty() && target!=0){
            target--;
            int k = q.size();
            ans+=k;
            for(int i=0;i<k;i++){
                int temp = q.poll();
                for(int nebr : adj.get(temp)){
                    if(visited[nebr]==false) { q.add(nebr); visited[nebr] = true; } 

                }
            }
        }
    return ans;
    }
}