class Solution {
    public boolean isBalanced(TreeNode root) {
        int value = recursion(root);
    return value != -1;
    }
    public int recursion(TreeNode root){
        if(root==null) return 0;
        int left = recursion(root.left);
        if(left==-1) return -1;
        int right = recursion(root.right);
        if(right==-1) return -1;
        if(Math.abs(right-left) > 1) return -1;
    return 1 + Math.max(left, right);
    }
}