class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        List<Integer> temp = new ArrayList<>();
        dfs(root, targetSum, temp, ans);
    return ans;
    }
    public void dfs(TreeNode root, int targetSum, List<Integer> temp, List<List<Integer>> ans){
        //if(root==null) return;
        if(root.left==null && root.right==null && root.val == targetSum){
            temp.add(root.val);
            ans.add(new ArrayList<>(temp));
            temp.remove(temp.size()-1);
            targetSum += root.val;
            return;
        }
        targetSum -= root.val;
        temp.add(root.val);
        if(root.left!=null) dfs(root.left, targetSum, temp, ans);
        if(root.right!=null) dfs(root.right, targetSum, temp, ans);
    temp.remove(temp.size()-1);
    targetSum += root.val;
    return;
    }
}