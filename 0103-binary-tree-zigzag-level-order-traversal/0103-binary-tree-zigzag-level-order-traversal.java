class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int level=0;
        while(!q.isEmpty()){
            int k = q.size();
            List<Integer> temp = new ArrayList<>();
            for(int i=0;i<k;i++){
                TreeNode top = q.poll();
                temp.add(top.val);
                if(top.left!=null) q.add(top.left);
                if(top.right!=null) q.add(top.right);
            }
            if(level%2==0) ans.add(temp);
            else{
                Collections.reverse(temp);
                ans.add(temp);
            }
            level++;
        }
    return ans;
    }
}