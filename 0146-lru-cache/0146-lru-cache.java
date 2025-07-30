class Node{
    int key;
    int value;
    Node next;
    Node prev;
    public Node(int key, int value){
        this.key = key;
        this.value = value;
        next=null;
        prev=null;
    }
}

class LRUCache {
    private Map<Integer,Node> map;
    private int capacity;
    private Node head;
    private Node tail;
    public LRUCache(int capacity) {
        map = new HashMap<>();
        this.capacity = capacity;
        head = new Node(-1,-1);
        tail = new Node(-1,-1);
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(!map.containsKey(key)) return -1;
        Node curr = map.get(key);
        int ans = curr.value;
        deleteNode(curr);
        insertAfterHead(curr);
    return ans;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node curr = map.get(key);
            curr.value = value;
            deleteNode(curr);
            insertAfterHead(curr);
        }
        else{
            if(capacity==map.size()){
                Node toBeDeleted = tail.prev;
                int toBeDeletedKey = toBeDeleted.key;
                map.remove(toBeDeletedKey);
                deleteNode(toBeDeleted);
            }
            Node newNode = new Node(key, value);
            insertAfterHead(newNode);
            map.put(key, newNode);
        }
    }
    public void insertAfterHead(Node node){
        Node next = head.next;
        head.next = node;
        node.prev = head;
        node.next = next;
        next.prev=node; 
    }
    public void deleteNode(Node node){
        Node prev = node.prev;
        Node next = node.next;
        prev.next = next;
        next.prev = prev;
    }
}
