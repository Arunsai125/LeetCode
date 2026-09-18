class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        int ans = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int k = q.size();
            for(int i=0;i<k;i++){
                TreeNode top = q.poll();
                ans = Math.max(ans, findHeight(top.left) + findHeight(top.right));
                if(top.left!=null) q.add(top.left);
                if(top.right!=null) q.add(top.right);
            }
        }
    return ans;
    }
    public int findHeight(TreeNode root){
        if(root==null) return 0;
    return 1 + Math.max(findHeight(root.left),findHeight(root.right));
    }
}