
// class Node {
//     public int val;
//     public Node left;
//     public Node right;
//     public Node next;

//     public Node() {}
    
//     public Node(int _val) {
//         val = _val;
//     }

//     public Node(int _val, Node _left, Node _right, Node _next) {
//         val = _val;
//         left = _left;
//         right = _right;
//         next = _next;
//     }
// };

class Solution {
    public Node connect(Node root) {
        if(root==null) return root;
        Queue<Node> q = new LinkedList<>();
        List<List<Node>> list = new ArrayList<>(); 
        root.next = null;
        q.add(root);
        while(!q.isEmpty()){
            int k = q.size();
            List<Node> tempList = new ArrayList<>();
            for(int i=0;i<k;i++){
                Node temp = q.poll();
                if(temp.left!=null) { q.add(temp.left); tempList.add(temp.left); }
                if(temp.right!=null) { q.add(temp.right); tempList.add(temp.right); }
            }
            if(tempList.size()>0) list.add(tempList);
        }
        for(List<Node> al : list){
                for(int i=0;i<al.size()-1;i++){
                    al.get(i).next = al.get(i+1);
                }
                al.get(al.size()-1).next = null;
        }
    return root;
    }
}