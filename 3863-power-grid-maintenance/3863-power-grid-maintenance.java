class Solution {
    public int[] processQueries(int c, int[][] connections, int[][] queries) {
        int[] parent = new int[c+1], rank = new int[c+1];
        for(int i = 1; i <= c; i++) parent[i] = i;
        for(int[] e : connections) union(parent, rank, e[0], e[1]);
        TreeSet<Integer>[] sets = new TreeSet[c+1];
        for(int i = 1; i <= c; i++){
            int r = find(parent, i);
            if(sets[r] == null) sets[r] = new TreeSet<>();
            sets[r].add(i);
        }
        boolean[] active = new boolean[c+1];
        Arrays.fill(active, true);
        List<Integer> res = new ArrayList<>();
        for(int[] q : queries){
            int t = q[0], x = q[1];
            if(t == 1){
                if(active[x]) res.add(x);
                else {
                    TreeSet<Integer> ts = sets[find(parent, x)];
                    res.add(ts.isEmpty() ? -1 : ts.first());
                }
            } else {
                if(active[x]){
                    active[x] = false;
                    sets[find(parent, x)].remove(x);
                }
            }
        }
        return res.stream().mapToInt(i -> i).toArray();
    }
    private int find(int[] p, int x){
        return p[x] == x ? x : (p[x] = find(p, p[x]));
    }
    private void union(int[] p, int[] r, int a, int b){
        int pa = find(p, a), pb = find(p, b);
        if(pa == pb) return;
        if(r[pa] < r[pb]) p[pa] = pb;
        else if(r[pb] < r[pa]) p[pb] = pa;
        else { p[pb] = pa; r[pa]++; }
    }
}
