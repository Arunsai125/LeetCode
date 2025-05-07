class Solution {
    public TreeNode bstToGst(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int k = q.size();
            for(int i=0;i<k;i++){
                TreeNode temp = q.poll();
                list.add(temp.val);
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
            }
        }
        Collections.sort(list);
        q.add(root);
        while(!q.isEmpty()){
            int k = q.size();
            for(int i=0;i<k;i++){
                TreeNode temp = q.poll();
                temp.val = temp.val + findValue(temp.val,list);
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
            }
        }
    return root;    
    }
    public int findValue(int num, List<Integer> list){
        int ans=0;
        int k = list.indexOf(num);
        for(int i=k+1;i<list.size();i++){
            ans += list.get(i);
        }
    return ans;
    } 
}