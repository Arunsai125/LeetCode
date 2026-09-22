class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<inorder.length;i++) map.put(inorder[i], i);
        TreeNode root = buildTree(inorder,0,inorder.length-1,postorder,0,postorder.length-1,map);
    return root;
    }
    public TreeNode buildTree(int[] inorder, int is, int ie, int[] postorder, int ps, int pe, Map<Integer,Integer> map){
        if(is>ie || ps>pe) return null;
        TreeNode root = new TreeNode(postorder[pe]);
        int inRoot = map.get(root.val);
        int leftSize = inRoot - is;
        root.left = buildTree(inorder,is, inRoot-1, postorder, ps, ps + leftSize - 1,map);
        root.right = buildTree(inorder, inRoot+1, ie, postorder, ps + leftSize, pe-1, map);
    return root;
    }
}