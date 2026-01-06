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
    public int maxLevelSum(TreeNode root) {
        int sum = root.val;
        int ans = 1;
        int level = 1;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int k = q.size();
            int levelSum = 0;
            boolean flag=false;
            for(int i=0;i<k;i++){
                TreeNode temp = q.poll();
                if(temp.left!=null) { q.add(temp.left); levelSum += temp.left.val; flag = true;}
                if(temp.right!=null) { q.add(temp.right); levelSum += temp.right.val; flag = true;}
            }
            level++;
            if(levelSum > sum && flag) { ans = level; sum = levelSum; }
        }
    return ans;
    }
}