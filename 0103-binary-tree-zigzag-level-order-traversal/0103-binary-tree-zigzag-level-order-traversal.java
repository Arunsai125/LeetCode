/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new LinkedList<>();
        Queue<TreeNode> q = new LinkedList<>();
        int c=0;
        q.offer(root);
        if(root==null) return ans;
        while(!q.isEmpty()){
            int k = q.size();
            List<Integer> li = new ArrayList<>();
            for(int i=0;i<k;i++){
            if(q.peek().left!=null) q.offer(q.peek().left);
            if(q.peek().right!=null) q.offer(q.peek().right);
            li.add(q.poll().val);
            }
            c++;
            if(c%2==0){
                reverse(li);
                ans.add(li);
            }
            else ans.add(li);
        }
    return ans;
    }
    public void reverse(List<Integer> ans){
        int e = ans.size()-1;
        int s=0;
        while(s<e){
            int end=ans.get(e);
            int start=ans.get(s);
            ans.set(s,end);
            ans.set(e,start);
            s++;
            e--;
        }
    }
}