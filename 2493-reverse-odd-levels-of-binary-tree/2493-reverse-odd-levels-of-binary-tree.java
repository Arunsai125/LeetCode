class Solution {
    public TreeNode reverseOddLevels(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int level=0;
        while(!q.isEmpty()){
            int k = q.size();
            for(int i=0;i<k;i++){
                TreeNode temp = q.poll();
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
            }
            level++;
            if(level%2==1 && !q.isEmpty()){
                int[] arr = new int[q.size()];
                int ptr=0;
                for(TreeNode node : q){
                    arr[ptr++] = node.val;
                }
                int revPtr = arr.length-1;
                for(TreeNode node : q){
                    node.val = arr[revPtr--];
                }
            }
        }
    return root;
    }
}