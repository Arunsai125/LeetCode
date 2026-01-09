/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        int height = findHeight(root);
        return findSubtree(root, height, 1);
    }
    public int findHeight(TreeNode root){
        if(root==null) return 0;
        int leftHeight = findHeight(root.left);
        int rightHeight = findHeight(root.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }
    public TreeNode findSubtree(TreeNode root, int maxHeight, int height){
        if(root==null || height==maxHeight) return root;
        TreeNode left = findSubtree(root.left, maxHeight, height+1);
        TreeNode right = findSubtree(root.right, maxHeight, height+1);
        if(left==null) return right;
        else if(right==null) return left;
    return root;
    }
}