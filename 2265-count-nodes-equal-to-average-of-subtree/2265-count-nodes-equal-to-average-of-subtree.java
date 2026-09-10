class Solution {
    public int averageOfSubtree(TreeNode root) {
        int ans=0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int k = q.size();
            for(int i=0;i<k;i++){
                TreeNode temp = q.poll();
                int averageValue = function(temp);
                if(averageValue==temp.val) ans++;
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
            }
        }
    return ans;
    }
    public int function(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();
        int c=0;
        int sum=0;
        q.add(root);
        while(!q.isEmpty()){
            int k = q.size();
            for(int i=0;i<k;i++){
                TreeNode temp = q.poll();
                sum += temp.val;
                c++;
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
            }
        }
    return sum/c;
    }
}