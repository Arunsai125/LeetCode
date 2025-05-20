class DisjointSet{
    List<Integer> parent;
    List<Integer> size;
    public DisjointSet(int n){
        parent = new ArrayList<>();
        size = new ArrayList<>();
        for(int i=0;i<n;i++){
            parent.add(i);
            size.add(1);
        }
    }
    public int findParent(int node){
        if(node==parent.get(node)) return node;
        int par = findParent(parent.get(node));
        parent.set(node, par);
    return parent.get(node);
    }
    public void unionBySize(int a, int b){
        int upa = findParent(a);
        int upb = findParent(b);
        if(upa==upb) return;
        if(size.get(upa) < size.get(upb)){
            parent.set(upa, upb);
            size.set(upb, size.get(upa) + size.get(upb));
        }
        else{
            parent.set(upb, upa);
            size.set(upa, size.get(upb) + size.get(upa));
        }
    }
}

class Solution {
    public int makeConnected(int n, int[][] connections) {
        if(connections.length < n-1) return -1;
        int ans=0;
        DisjointSet ds = new DisjointSet(n);
        for(int[] con : connections){
            ds.unionBySize(con[0],con[1]);
        }
        for(int i=0;i<n;i++){
            if(ds.findParent(i)==i) ans++;
        }
    return ans-1;
    }
}