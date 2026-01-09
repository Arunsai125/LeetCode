class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
       List<TreeNode> list1 = new ArrayList<>();
       List<TreeNode> list2 = new ArrayList<>();
       findPath(root, p, list1);
       findPath(root, q, list2);
       int n = Math.min(list1.size(), list2.size());
       TreeNode ans = new TreeNode(-1);
       for(int i=0;i<n;i++){
            if(list1.get(i) == list2.get(i)) ans = list1.get(i);
            else break;
       }
    return ans;
    }
    public boolean findPath(TreeNode root, TreeNode target, List<TreeNode> ans){
        if(root == null) return false;
        ans.add(root);
        if(root == target) return true;
        if(findPath(root.left,target,ans) || findPath(root.right, target, ans)) return true;
        ans.remove(ans.size()-1);
    return false;
    }
}