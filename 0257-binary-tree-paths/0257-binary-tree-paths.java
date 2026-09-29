class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        if(root==null) return ans;
        StringBuilder sb = new StringBuilder();
        recursion(root, sb, ans);
    return ans;        
    }
    public void recursion(TreeNode root, StringBuilder str, List<String> ans){
        int len = str.length();
        str.append(root.val);
        if(root.left==null && root.right==null){
            ans.add(str.toString());
            str.setLength(len);
            return;
        }
        str.append("->");
        if(root.left!=null) recursion(root.left, str, ans);
        if(root.right!=null) recursion(root.right, str, ans);
        str.setLength(len);
    }
}