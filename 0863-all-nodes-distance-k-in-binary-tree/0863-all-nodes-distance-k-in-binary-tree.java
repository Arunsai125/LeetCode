class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int v) {
        List<Integer> ans = new ArrayList<>();
        if(root==null) return ans;
        Map<TreeNode,TreeNode> parentMap = new HashMap<>();
        markParents(root, parentMap);
        Set<TreeNode> visited = new HashSet<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(target);
        visited.add(target);
        int distance=0;
        while(!q.isEmpty()){
            if(distance==v){break;}
            distance++;
            int k = q.size();
            for(int i=0;i<k;i++){
                TreeNode top = q.poll();
                if(top.left!=null && !visited.contains(top.left)){
                    q.add(top.left);
                    visited.add(top.left);
                }
                if(top.right!=null && !visited.contains(top.right)){
                    q.add(top.right);
                    visited.add(top.right);
                }
                if(parentMap.containsKey(top) && !visited.contains(parentMap.get(top))){
                    q.add(parentMap.get(top));
                    visited.add(parentMap.get(top));
                }
            }
        }
        while(!q.isEmpty()){
            ans.add(q.poll().val);
        }
    return ans;
    }
    public void markParents(TreeNode root, Map<TreeNode,TreeNode> map){
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int k = q.size();
            for(int i=0;i<k;i++){
                TreeNode top = q.poll();
                if(top.left!=null){
                    map.put(top.left, top);
                    q.add(top.left);
                }
                if(top.right!=null){
                    map.put(top.right,top);
                    q.add(top.right);
                }
            }
        }
    }
}