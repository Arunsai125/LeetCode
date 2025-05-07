class Solution {
    int sum=0;
    public TreeNode bstToGst(TreeNode root) {
        inorder(root);
    return root;
    }
    public void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.right);
        sum += root.val;
        root.val = sum;
        inorder(root.left);
    }
}