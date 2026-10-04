class Pair{
    TreeNode node;
    int value;
    public Pair(TreeNode node, int value){
        this.node = node;
        this.value = value;
    }
}


class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int ans = 1;
        Queue<Pair> q = new LinkedList<>();
        int min=0;
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            int k = q.size();
            int left = 0;
            int right = 0;
            min = q.peek().value;
            for(int i=0;i<k;i++){
                Pair top = q.poll();
                TreeNode node = top.node;
                if(i==0){left = top.value-min;}
                if(i==k-1){right = top.value-min;}
                if(node.left!=null) q.add(new Pair(node.left, 2*(top.value-min) + 1));
                if(node.right!=null) q.add(new Pair(node.right, 2*(top.value-min) + 2));
            }
            ans = Math.max(ans, right-left+1);
        }
    return ans;        
    }
}