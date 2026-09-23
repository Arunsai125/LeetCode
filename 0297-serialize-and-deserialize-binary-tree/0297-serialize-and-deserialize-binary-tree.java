
public class Codec {

    public String serialize(TreeNode root) {
        if(root==null) return "";
        Queue<TreeNode> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode top = q.poll();
            if(top==null){
                sb.append("x ");
                continue;
            }
            sb.append(top.val).append(" ");
            q.add(top.left);
            q.add(top.right);
        }
    return sb.toString();
    }

    public TreeNode deserialize(String data) {
        if(data.equals("")) return null;
        Queue<TreeNode> q = new LinkedList<>();
        String[] values = data.split(" ");
        TreeNode root = new TreeNode(Integer.parseInt(values[0]));
        q.add(root);
        int i=1;
        while(!q.isEmpty()){
            TreeNode temp = q.poll();
            if(!values[i].equals("x")){
                TreeNode left = new TreeNode(Integer.parseInt(values[i]));
                temp.left = left;
                q.add(left);
            }
            i++;
            if(!values[i].equals("x")){
                TreeNode right = new TreeNode(Integer.parseInt(values[i]));
                temp.right = right;
                q.add(right);
            }
            i++;
        }
    return root;
    }
}
