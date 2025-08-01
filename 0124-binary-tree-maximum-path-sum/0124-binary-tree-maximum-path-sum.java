class Solution {
    public int maxPathSum(TreeNode root) {
        int[] ans = {Integer.MIN_VALUE};
        recursion(root, ans);
    return ans[0];
    }
    public int recursion(TreeNode root, int[] ans){
        if(root==null) return 0;
        int left = Math.max(0, recursion(root.left, ans));
        int right = Math.max(0, recursion(root.right, ans));
        ans[0] = Math.max( ans[0], root.val + left + right);
        return root.val + Math.max(left,right);
    }
}