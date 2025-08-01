class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        int ans[] = {0};
        recursion(root, ans);
    return ans[0];
    }
    public int recursion(TreeNode root, int[] ans){
        if(root==null) return 0;
        int left = recursion(root.left, ans);
        int right = recursion(root.right, ans);
        ans[0] = Math.max(ans[0], left + right);
        return 1 + Math.max(left,right);
    }
}