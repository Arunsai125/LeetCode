class Solution {
    public int specialNodes(int n, int[][] edges, int x, int y, int z) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());
        for (int[] e : edges) {
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]);
        }
        int[] dx = bfs(graph, x, n);
        int[] dy = bfs(graph, y, n);
        int[] dz = bfs(graph, z, n);
        int count = 0;
        for (int i = 0; i < n; i++) {
            int[] arr = {dx[i], dy[i], dz[i]};
            Arrays.sort(arr);
            if (arr[0]*arr[0] + arr[1]*arr[1] == arr[2]*arr[2]) count++;
        }
        return count;
    }
    private int[] bfs(List<List<Integer>> graph, int start, int n) {
        int[] dist = new int[n];
        Arrays.fill(dist, -1);
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        dist[start] = 0;
        while (!q.isEmpty()) {
            int u = q.poll();
            for (int v : graph.get(u)) {
                if (dist[v] == -1) {
                    dist[v] = dist[u] + 1;
                    q.offer(v);
                }
            }
        }
        return dist;
    }
}
