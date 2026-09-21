class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        int[] ptr = {0};
    return constructBST(preorder, ptr, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    public TreeNode constructBST(int[] array, int[] ptr, int min, int max){
        if(ptr[0] == array.length || array[ptr[0]] < min || array[ptr[0]] > max) return null;
        TreeNode root = new TreeNode(array[ptr[0]++]);
        root.left = constructBST(array,ptr,min, root.val);
        root.right = constructBST(array, ptr, root.val, max);
    return root;
    }
}