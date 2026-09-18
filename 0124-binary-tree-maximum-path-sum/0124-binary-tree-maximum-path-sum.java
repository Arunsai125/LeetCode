class Solution {
    public int maxPathSum(TreeNode root) {
        int[] ans = {Integer.MIN_VALUE};
        findSum(root, ans);
    return ans[0];        
    }
    public int findSum(TreeNode root, int[] ans){
        if(root==null) return 0;
        int leftSum = Math.max(0, findSum(root.left,ans));
        int rightSum = Math.max(0,findSum(root.right, ans));
        ans[0] = Math.max(ans[0], root.val + leftSum + rightSum);
    return root.val + Math.max(leftSum, rightSum);
    }
}