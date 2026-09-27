class Node{
    int key;
    int value;
    Node prev;
    Node next;
    public Node(int key, int value){
        this.key = key;
        this.value=value;
        this.prev = null;
        this.next=null;
    }
}

class LRUCache {
    private int capacity;
    private Map<Integer,Node> map;
    private Node head;
    private Node tail;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        head = new Node(-1,-1);
        tail = new Node(-1,-1);
        head.next=tail;
        tail.prev = head;
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
        }
        else{        
            if(map.size() == capacity){
                Node del = tail.prev;
                map.remove(del.key);
                deleteNode(del);
            }                
                Node node = new Node(key,value);
                map.put(key, node);
                insertAfterHead(node);
        }
    }
    public void deleteNode(Node node){
        Node prev = node.prev;
        Node next = node.next;
        node.prev = null;
        node.next=null;
        if(prev!=null) prev.next=next;
        if(next!=null) next.prev=prev;
    }
    public void insertAfterHead(Node node){
        Node nextHead = head.next;
        head.next = node;
        node.prev = head;
        node.next = nextHead;
        nextHead.prev = node;
    }
}