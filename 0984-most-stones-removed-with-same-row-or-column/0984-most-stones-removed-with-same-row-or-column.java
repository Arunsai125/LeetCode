class DisjointSet{
    int[] parent;
    int[] size;
    public DisjointSet(int n){
        parent = new int[n];
        size = new int[n];
        for(int i=0;i<n;i++){
            parent[i]=i;
            size[i]=1;
        }
    }
    public int findParent(int node){
        if(parent[node]==node) return node;
        int up = findParent(parent[node]);
        parent[node] = up;
    return parent[node];
    }

    public void unionBySize(int a, int b){
        int upa = findParent(a);
        int upb = findParent(b);
        if(upa==upb) return;
        if(size[upa] < size[upb]){
            parent[upa] = upb;
            size[upb] += size[upa];
        }
        else{
            parent[upb] = upa;
            size[upa] += size[upb];
        }
    }
}

class Solution {
    public int removeStones(int[][] stones) {
        if(stones.length<=1) return 0;
        int n = stones.length;
        DisjointSet ds = new DisjointSet(n);
        int cnt=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int[] node1 = stones[i];
                int[] node2 = stones[j];
                if(node1[0]==node2[0] || node1[1]==node2[1]){
                    ds.unionBySize(i,j);
                }
            }
        }
        for(int i=0;i<n;i++){
            if(ds.findParent(i)==i) cnt++;
        }
    return n-cnt;
    }
}