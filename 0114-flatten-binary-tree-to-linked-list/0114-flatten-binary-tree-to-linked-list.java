class Solution {
    public void flatten(TreeNode root) {
        if(root==null) return;
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            TreeNode top = st.pop();
            if(top.right != null) st.push(top.right);
            if(top.left != null) st.push(top.left);
            if(!st.isEmpty()) top.right = st.peek();
            top.left = null;
        }
    }
}