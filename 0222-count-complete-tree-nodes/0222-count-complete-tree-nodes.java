class Solution {
    public int countNodes(TreeNode root) {
        if(root==null) return 0;
        int leftHeight = findLeftHeight(root);
        int rightHeight = findRightHeight(root);
        if(leftHeight == rightHeight) return (1<<leftHeight) - 1;
    return 1 + countNodes(root.left) + countNodes(root.right);        
    }
    public int findLeftHeight(TreeNode root){
        if(root==null) return 0;
        int ans = 0;
        while(root!=null){
            ans++;
            root = root.left;
        }
    return ans;
    }
    public int findRightHeight(TreeNode root){
        if(root==null) return 0;
        int ans=0;
        while(root!=null){
            ans++;
            root=root.right;
        }
    return ans;
    }
}