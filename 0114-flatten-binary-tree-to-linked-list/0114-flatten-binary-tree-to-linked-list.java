class Solution {
    TreeNode prev = null;
    public void flatten(TreeNode root) {
        recursion(root);
    }
    public void recursion(TreeNode root){
        if(root==null) return;
        recursion(root.right);
        recursion(root.left);
        root.right = prev;
        root.left = null;
        prev = root;
    }
}