
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        TreeNode root = recursion(preorder,0,preorder.length-1,inorder,0,inorder.length-1,map);
    return root;
    }
    public TreeNode recursion(int[] pre, int ps, int pe, int[] in, int is, int ie, Map<Integer,Integer> map){
        if(ps>pe || is>ie) return null;
        TreeNode root = new TreeNode(pre[ps]);
        int ind = map.get(root.val);
        int lsize = ind - is;
        root.left = recursion(pre,ps+1,ps+lsize,in,is,ind-1,map);
        root.right = recursion(pre, ps+lsize+1,pe,in,ind+1,ie,map);
    return root;
    }
}