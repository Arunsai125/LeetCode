class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int[] sum = {0};
    return dfs(root, sum, targetSum);
    }
    public boolean dfs(TreeNode root, int[] sum, int targetSum){
        if(root==null) return false;
        sum[0] += root.val;
        if(root.left==null && root.right==null) {
            boolean result = sum[0] == targetSum;
            sum[0] -= root.val;
        return result;
        }
        boolean left =  dfs(root.left, sum, targetSum);
        boolean right =  dfs(root.right, sum, targetSum);
        sum[0] -= root.val;
    return left || right;
    }
}