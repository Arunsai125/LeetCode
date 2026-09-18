class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null) return ans;
        q.add(root);
        while(!q.isEmpty()){
            int k = q.size();
            List<Integer> temp = new ArrayList<>();
            for(int i=0;i<k;i++){
                TreeNode top = q.poll();
                temp.add(top.val);
                if(top.left!=null) q.add(top.left);
                if(top.right!=null) q.add(top.right);
            }
            ans.add(temp);
        }
    return ans;
    }
}