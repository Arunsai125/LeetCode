class Solution {
    public int[] maxTargetNodes(int[][] edges1, int[][] edges2) {
        int n = edges1.length + 1;
        int m = edges2.length + 1;
        List<List<Integer>> adj1 = new ArrayList<>();
        List<List<Integer>> adj2 = new ArrayList<>();
        for(int i = 0; i < n; i++) adj1.add(new ArrayList<>());
        for(int i = 0; i < m; i++) adj2.add(new ArrayList<>());
        for(int[] e : edges1) {
            adj1.get(e[0]).add(e[1]);
            adj1.get(e[1]).add(e[0]);
        }
        for(int[] e : edges2) {
            adj2.get(e[0]).add(e[1]);
            adj2.get(e[1]).add(e[0]);
        }
        int[] depth1 = new int[n];
        int[] d1Counts = bfsDepthAndCount(adj1, depth1);
        int even1 = d1Counts[0], odd1 = d1Counts[1];
        int[] depth2 = new int[m];
        int[] d2Counts = bfsDepthAndCount(adj2, depth2);
        int even2 = d2Counts[0], odd2 = d2Counts[1];
        int best2 = Math.max(even2, odd2);

        int[] ans = new int[n];
        for(int i = 0; i < n; i++) {
            int sameParityCount = (depth1[i] % 2 == 0 ? even1 : odd1);
            ans[i] = sameParityCount + best2;
        }
        return ans;
    }
    private int[] bfsDepthAndCount(List<List<Integer>> adj, int[] depth) {
        int n = adj.size();
        boolean[] vis = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        vis[0] = true;
        depth[0] = 0;

        while(!q.isEmpty()) {
            int u = q.poll();
            for(int v : adj.get(u)) {
                if(!vis[v]) {
                    vis[v] = true;
                    depth[v] = depth[u] + 1;
                    q.add(v);
                }
            }
        }

        int[] cnt = new int[2];
        for(int d : depth) cnt[d % 2]++;
        return cnt;
    }
}
