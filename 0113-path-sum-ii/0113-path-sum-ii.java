class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        int[] sum = {targetSum};
        dfs(root, sum, path, ans);
    return ans;
    }
    public void dfs(TreeNode root, int[] sum,  List<Integer> path, List<List<Integer>> ans){
        if(root==null) return;
        sum[0] -= root.val;
        path.add(root.val);
        if(root.left==null && root.right==null && sum[0] == 0){
            ans.add(new ArrayList<>(path));
            sum[0] += root.val;
            path.remove(path.size()-1);
            return;
        }
        dfs(root.left, sum, path, ans);
        dfs(root.right, sum, path, ans);
        sum[0] += root.val;
        path.remove(path.size()-1);
    }
}