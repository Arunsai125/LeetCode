class Solution {
    public int maxPathSum(TreeNode root) {
        int[] ans = {Integer.MIN_VALUE};
        findSum(root, ans);
    return ans[0];
    }
    public int findSum(TreeNode root, int[] ans){
        if(root==null) return 0;
        int lsum = Math.max(0, findSum(root.left, ans));
        int rsum = Math.max(0, findSum(root.right, ans));
        ans[0] = Math.max(ans[0], root.val + lsum + rsum);
    return root.val + Math.max(lsum, rsum);
    }
}