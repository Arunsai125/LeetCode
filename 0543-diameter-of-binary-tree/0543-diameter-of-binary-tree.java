class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        int[] ans = {0};
        findHeight(root, ans);
    return ans[0];
    }
    public int findHeight(TreeNode root, int[] ans){
        if(root==null) return 0;
        int lh = findHeight(root.left, ans);
        int rh = findHeight(root.right, ans);
        ans[0] = Math.max(ans[0], lh+rh);
    return 1 + Math.max(lh, rh);
    }
}