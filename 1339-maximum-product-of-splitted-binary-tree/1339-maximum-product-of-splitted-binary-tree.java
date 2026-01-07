class Solution {
    public int maxProduct(TreeNode root) {
        int mod = 1000000007;
        long totalSum = findTotalSum(root);
        long ans[] = new long[1];
        ans[0] = Long.MIN_VALUE;
        dfs(root, ans, totalSum);
    return (int) (ans[0] % mod);
    }
    public long findTotalSum(TreeNode root){
        long ans = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        ans += (long) root.val;
        while(!q.isEmpty()){
            int k = q.size();
            for(int i=0;i<k;i++){
                TreeNode temp = q.poll();
                if(temp.left!=null){
                    q.add(temp.left); 
                    ans += (long) temp.left.val;
                }
                if(temp.right!=null){
                    q.add(temp.right);
                    ans += (long) temp.right.val;
                }
            }
        }
    return ans;
    }
    public long dfs(TreeNode root, long[] ans, long totalSum){
        if(root==null) return 0;
        long leftSum = dfs(root.left, ans, totalSum);
        long rightSum = dfs(root.right, ans, totalSum);
        long subtreeSum = leftSum + rightSum + root.val;
        ans[0] = Math.max(ans[0], (subtreeSum * (totalSum-subtreeSum)));
        return subtreeSum;
    }
}