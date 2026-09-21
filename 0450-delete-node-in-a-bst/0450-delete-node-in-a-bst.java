class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return null;
        if(root.val == key) return reorderTree(root);
        TreeNode temp = root;
        while(temp!=null){
            if(temp.val < key){
                if(temp.right!=null && temp.right.val==key){
                    temp.right = reorderTree(temp.right);
                    break;
                }
                else temp = temp.right;
            }
            else{
                if(temp.left!=null && temp.left.val==key){
                    temp.left = reorderTree(temp.left);
                    break;
                }
                else temp = temp.left;
            }
        }
    return root;
    }
    public TreeNode reorderTree(TreeNode root){
        if(root.left==null) return root.right;
        if(root.right==null) return root.left;
        TreeNode rightNode = root.right;
        TreeNode rightNodeParent = findrightMost(root.left);
        rightNodeParent.right = rightNode;
    return root.left;
    }
    public TreeNode findrightMost(TreeNode root){
        if(root.right==null) return root;
    return findrightMost(root.right);
    }
}