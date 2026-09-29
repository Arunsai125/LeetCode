class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        int sum = targetSum;
        dfs(root, sum, path, ans);
    return ans;
    }
    public void dfs(TreeNode root, int sum,  List<Integer> path, List<List<Integer>> ans){
        if(root==null) return;
        sum -= root.val;
        path.add(root.val);
        if(root.left==null && root.right==null && sum == 0){
            ans.add(new ArrayList<>(path));
            path.remove(path.size()-1);
            return;
        }
        dfs(root.left, sum, path, ans);
        dfs(root.right, sum, path, ans);
        path.remove(path.size()-1);
    }
}