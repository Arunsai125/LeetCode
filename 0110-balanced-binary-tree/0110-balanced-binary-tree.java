
class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        int lh = findHeight(root.left);
        int rh = findHeight(root.right);
        if(Math.abs(lh-rh) > 1) return false;
        boolean leftNode = isBalanced(root.left);
        boolean rightNode = isBalanced(root.right);
        if(!leftNode || !rightNode) return false;
    return true;
	}
    public int findHeight(TreeNode root){
        if(root==null) return 0;
    return 1 + Math.max(findHeight(root.left), findHeight(root.right));
    }
}