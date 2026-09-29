class Solution {
    public int sumNumbers(TreeNode root) {
        int[] ans = {0};
        int[] sum = {0};
        dfs(root, sum, ans);
    return ans[0];
    }
    public void dfs(TreeNode root, int[] sum, int[] ans){
        if(root == null) return;
        sum[0] = (sum[0] * 10) + root.val;
        if(root.left==null && root.right==null) ans[0] += sum[0];
        dfs(root.right, sum, ans);
        dfs(root.left, sum, ans);
        sum[0] /= 10;
    }
}