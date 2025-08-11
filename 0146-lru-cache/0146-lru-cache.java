class Node{
    int key;
    int value;
    Node prev;
    Node next;
    public Node(int key, int value){
        this.key=key;
        this.value=value;
        prev=null;
        next=null;
    }
}

class LRUCache {
    Map<Integer,Node> map;
    int capacity;
    Node head;
    Node tail;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        head = new Node(-1,-1);
        tail = new Node(-1,-1);
        head.next=tail;
        tail.prev=head;     
    }
    
    public int get(int key) {
        if(!map.containsKey(key)) return -1;
        Node node = map.get(key);
        int ans = node.value;
        deleteNode(node);
        insertAfterHead(node);
        return ans;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node node = map.get(key);
            node.value = value;
            deleteNode(node);
            insertAfterHead(node);
        return;
        }
        if(capacity == map.size()){
            Node toBeDeletedNode = tail.prev;
            int toBeRemovedKey = toBeDeletedNode.key;
            map.remove(toBeRemovedKey);
            deleteNode(toBeDeletedNode);
        }
        Node newNode = new Node(key, value);
        insertAfterHead(newNode);
        map.put(key, newNode);
    }

    public void deleteNode(Node node){
        Node prev = node.prev;
        Node next = node.next;
        prev.next = next;
        next.prev = prev;
    }

    public void insertAfterHead(Node node){
        Node next = head.next;
        head.next = node;
        node.next = next;
        node.prev = head;
        next.prev = node;
    }
}
