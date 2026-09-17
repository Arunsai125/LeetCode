class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        preorderRecursion(ans, root);
    return ans;
    }
    public void preorderRecursion(List<Integer> ans, TreeNode root){
        if(root==null) return;
        ans.add(root.val);
        preorderRecursion(ans, root.left);
        preorderRecursion(ans, root.right);
    }
}