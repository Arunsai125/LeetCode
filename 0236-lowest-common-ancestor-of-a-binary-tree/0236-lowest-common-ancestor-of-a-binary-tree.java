class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> path1 = new ArrayList<>();
        findPath(root, p, path1);
        List<TreeNode> path2 = new ArrayList<>();;
        findPath(root, q, path2);
        TreeNode ans = null;
        for(int i=0;i<Math.min(path1.size(), path2.size());i++){
            if(path1.get(i) == path2.get(i))
                ans = path1.get(i);
        }
    return ans;
    }
    public boolean findPath(TreeNode root, TreeNode target, List<TreeNode> path){
        if(root==null) return false;
        path.add(root);
        if(root==target) return true;
        if(findPath(root.left,target,path) || findPath(root.right, target, path)) return true;
        path.remove(path.size()-1);
    return false;
    }
}