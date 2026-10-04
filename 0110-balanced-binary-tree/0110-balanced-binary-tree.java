class Solution {
    public boolean isBalanced(TreeNode root) {
        int height = findHeight(root);
    return height!=-1;  
    }
    public int findHeight(TreeNode root){
        if(root==null) return 0;
        int lh = findHeight(root.left);
        if(lh==-1) return -1;
        int rh = findHeight(root.right);
        if(rh==-1) return -1;
        if(Math.abs(rh-lh) > 1) return -1;
    return 1 + Math.max(lh, rh);
    }
}