class Solution {
    public int minDiffInBST(TreeNode root) {
        int ans = Integer.MAX_VALUE;
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();;
        q.add(root);
        while(!q.isEmpty()){
            int k = q.size();
            for(int i=0;i<k;i++){
                TreeNode top = q.poll();
                list.add(top.val);
                if(top.left!=null){
                    q.add(top.left);
                }
                if(top.right!=null){
                    q.add(top.right);
                }
            }
        }
        Collections.sort(list);
        for(int i=1;i<list.size();i++){
            ans = Math.min(ans, list.get(i)-list.get(i-1));
        }
    return ans;
    }
}