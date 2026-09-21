class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode temp = root;
        if(root==null) return new TreeNode(val);
        while(true){
            if(temp.val < val){
                if(temp.right==null){
                    temp.right = new TreeNode(val);
                    break;
                }
                else temp = temp.right;
            }
            else{
                if(temp.left==null){
                    temp.left = new TreeNode(val);
                    break;
                }
                else temp = temp.left;
            }
        }        
    return root;
    }
}