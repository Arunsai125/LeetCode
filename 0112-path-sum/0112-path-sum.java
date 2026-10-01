class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false;
        if(root.left==null && root.right==null && root.val == targetSum) return true;
        targetSum -= root.val;
        boolean left = false;
        boolean right = false;
        if(root.left!=null)  left = hasPathSum(root.left, targetSum);
        if(root.right!=null)  right = hasPathSum(root.right, targetSum);
    return left || right;
    }
}