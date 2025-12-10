class Solution {
    public Node connect(Node root) {
        if(root==null) return root;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node prev = null;
            int k = q.size();
            for(int i=0;i<k;i++){
                Node curr = q.poll();
                if(prev != null){
                    prev.next = curr;
                }
                prev = curr;
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
            prev.next = null;
        }
    return root;
    }
}