
class Solution {
    public int sumRootToLeaf(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        return solve(root, sb);
    }
    public int solve(TreeNode root, StringBuilder sb){
         if (root == null) return 0;
        sb.append(root.val);
        if(root.left == null && root.right==null){
            int val =  Integer.parseInt(sb.toString(), 2);
            sb.deleteCharAt(sb.length() - 1);
            return val;
        }
        int left = solve(root.left, sb);
        int right = solve(root.right, sb);
        sb.deleteCharAt(sb.length() - 1);
    return left+right;
    }
}