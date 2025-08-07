/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    public String serialize(TreeNode root) {
        StringBuilder ans = new StringBuilder();
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null) return "";
        q.add(root);
        while(!q.isEmpty()){
                TreeNode temp = q.poll();
                if(temp!=null){
                    ans.append(temp.val).append(",");
                    q.add(temp.left);
                    q.add(temp.right);
                }
                else{
                    ans.append("#,");
                }  
            }
        return ans.toString();
        }
    public TreeNode deserialize(String data) {
        if(data.isEmpty()) return null;
        String[] values = data.split(",");
        TreeNode root = new TreeNode(Integer.parseInt(values[0]));
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int i=1;
        while(!q.isEmpty()){
            TreeNode temp = q.poll();
            if(!values[i].equals("#")){
                temp.left = new TreeNode(Integer.parseInt(values[i]));
                q.add(temp.left);
            }
            i++;
            if(!values[i].equals("#")){
                temp.right = new TreeNode(Integer.parseInt(values[i]));
                q.add(temp.right);
            }
            i++;
        }
    return root;
    }
}
