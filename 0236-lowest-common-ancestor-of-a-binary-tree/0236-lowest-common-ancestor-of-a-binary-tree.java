class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> path1 = new ArrayList<>();
        List<TreeNode> path2 = new ArrayList<>();
        findPath(root, q, path1); findPath(root, p, path2);
        int n = Math.min(path1.size(), path2.size());
        TreeNode ans = root;
        for(int i=0;i<n;i++){
            if(path1.get(i)==path2.get(i)) ans = path1.get(i);
           else break;
        }
    return ans;        
    }
    public boolean findPath(TreeNode root, TreeNode target, List<TreeNode> ans){
        if(root==null) return false;
        ans.add(root);
        if(root==target) return true;
        if(findPath(root.left,target,ans) || findPath(root.right,target,ans)) return true;
        ans.remove(ans.size()-1);
    return false;
    }
}