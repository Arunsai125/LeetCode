class Node{
    int freq;
    List<String> list;
    Node prev;
    Node next;
    public Node(int freq){
        this.freq = freq;
        this.prev = null;
        this.next = null;
        this.list = new ArrayList<>();
    }
}

class AllOne {
    Map<String,Node> map;
    Node head;
    Node tail;
    public AllOne() {
        map = new HashMap<>();
        head = new Node(-1);
        tail = new Node(-1);
        head.next = tail;
        tail.prev = head;
    }
    
    public void inc(String key) {
        if(map.containsKey(key)){
            Node curNode = map.get(key);
            Node next = curNode.next;
            if(next==tail || next.freq!=curNode.freq+1){
                Node newNode = new Node(curNode.freq+1);
                newNode.list.add(key);
                insertAfter(curNode, newNode);
                map.put(key, newNode);
            }
            else{
                curNode.next.list.add(key);
                map.put(key, curNode.next);
            }
            curNode.list.remove(key);
            if(curNode.list.size()==0){
                deleteNode(curNode);
            }
        }
        else{
            if(head.next==tail || head.next.freq!=1){
                Node newNode = new Node(1);
                newNode.list.add(key);
                insertAfter(head, newNode);
                map.put(key, newNode);
            }
            else{
                head.next.list.add(key);
                map.put(key, head.next);
            }
        return;
        }
    }
    
    public void dec(String key) {
        Node curNode = map.get(key);
        curNode.list.remove(key);
        if(curNode.freq == 1){
            map.remove(key);
            if(curNode.list.size()==0) deleteNode(curNode);
        }
        else if(curNode.prev.freq != curNode.freq-1){
            Node newNode = new Node(curNode.freq-1);
            newNode.list.add(key);
            insertAfter(curNode.prev, newNode);
            map.put(key, newNode);
             if(curNode.list.size()==0) deleteNode(curNode);
        }
        else{
            curNode.prev.list.add(key);
            map.put(key, curNode.prev);
            if(curNode.list.size()==0) deleteNode(curNode);
        }
    }
    
    public String getMaxKey() {
        List<String> list = tail.prev.list;
        if(list.isEmpty()) return "";
    return list.get(0);
    }
    
    public String getMinKey() {
        List<String> list = head.next.list;
        if(list.isEmpty()) return "";
    return list.get(0);
    }
    public void deleteNode(Node node){
        Node prev = node.prev;
        Node next = node.next;
        if(prev!=null) {
            node.prev = null;
            prev.next = next;
        }
        if(next!=null){
            node.next=null;
            next.prev = prev;
        }
    }
    public void insertAfter(Node node, Node curr){
        Node next = node.next;
        curr.prev = node;
        curr.next = next;
        node.next = curr;
        next.prev = curr;
    }
}

