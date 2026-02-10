class Solution {
    public TreeNode balanceBST(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();
        inorder(root, list);
        return buildBST(list, 0, list.size()-1);
    }
    public void inorder(TreeNode root, List<TreeNode> list){
        if(root==null) return;
        inorder(root.left, list);
        list.add(root);
        inorder(root.right, list);
    }
    public TreeNode buildBST(List<TreeNode> list, int left, int right){
        if(left > right) return null;
        int mid = (left+right)/2;
        TreeNode root = list.get(mid);
        root.left = buildBST(list, left, mid-1);
        root.right = buildBST(list, mid+1, right);
    return root;
    }
}