class Solution {
    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        q.add(root);
        while(!q.isEmpty()){
            int k = q.size();
            List<Integer> al = new ArrayList<>();
            for(int i=0;i<k;i++){
                TreeNode temp = q.poll();
                al.add(temp.val);
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
            }
        list.add(al);
        }
        int ans=0;
        for(int i=0;i<list.get(list.size()-1).size();i++){
            ans +=  list.get(list.size()-1).get(i);
        }        
    return ans;
    }
}