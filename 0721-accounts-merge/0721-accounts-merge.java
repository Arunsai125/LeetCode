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
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        int n = accounts.size();
        Map<String, Integer> map = new HashMap<>();
        DisjointSet ds = new DisjointSet(accounts.size());
        for(int i=0;i<accounts.size();i++){
            for(int j=1;j<accounts.get(i).size();j++){
                String curr = accounts.get(i).get(j);
                if(map.containsKey(curr)){
                    ds.unionBySize(i, map.get(curr));
                }
                else{
                    map.put(curr, i);
                }
            }
        }
        List<List<String>> temp = new ArrayList<>();
        for(int i=0;i<n;i++) temp.add(new ArrayList<>());
        for(String key : map.keySet()){
            int up = ds.findParent(map.get(key));
            temp.get(up).add(key);
        }
        List<List<String>> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            List<String> currList = temp.get(i);
            if(currList .size()==0) continue;
            Collections.sort(currList);
            currList .add(0, accounts.get(i).get(0));
            ans.add(currList);
        }
    return ans;
    }
}