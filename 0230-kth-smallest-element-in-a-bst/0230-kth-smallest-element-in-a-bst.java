class Solution {
    public int kthSmallest(TreeNode root, int k) {
        int[] ans = {0};
        int[] count = {0};
        recursiveInorder(root, k,count,ans);
    return ans[0];
    }
    public void recursiveInorder(TreeNode root, int k, int[] count, int[] ans){
        if(root==null) return;
        recursiveInorder(root.left,k,count,ans);
        count[0]++;
        if(count[0]==k) { ans[0] = root.val; return; }
        recursiveInorder(root.right,k,count,ans);
    }
}