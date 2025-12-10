
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int k = q.size();
            for(int i=0;i<k;i++){
                TreeNode temp = q.poll();
                if(i==k-1) ans.add(temp.val);
                if(temp.left!=null) q.add(temp.left); 
                if(temp.right!=null) q.add(temp.right); 
            }
        }
    return ans;
    }
}