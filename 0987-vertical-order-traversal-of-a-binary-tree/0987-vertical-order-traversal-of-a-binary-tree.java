class Tuple{
    TreeNode node;
    int row;
    int col;
    public Tuple(TreeNode node, int row, int col){
        this.node=node;
        this.row=row;
        this.col=col;
    }
}

class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        Map<Integer,Map<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        Queue<Tuple> q = new LinkedList<>();
        q.add(new Tuple(root,0,0));
        while(!q.isEmpty()){
            int k = q.size();
            for(int i=0;i<k;i++){
                Tuple top = q.poll();
                int val = top.node.val;
                int x = top.row;
                int y = top.col;
                if(!map.containsKey(x)) map.put(x, new TreeMap<Integer, PriorityQueue<Integer>>());
                if(!map.get(x).containsKey(y)) map.get(x).put(y, new PriorityQueue<>());
                map.get(x).get(y).offer(val);
                if(top.node.left!=null) q.add(new Tuple(top.node.left, x-1, y+1));
                if(top.node.right!=null) q.add(new Tuple(top.node.right, x+1, y+1));
            }
        }
        for(Map<Integer,PriorityQueue<Integer>> subMap : map.values()){
            ans.add(new ArrayList<>());
            for(PriorityQueue<Integer> pq : subMap.values()){
                while(!pq.isEmpty()){
                    ans.get(ans.size()-1).add(pq.poll());
                }
            }
        }
    return ans;
    }
}