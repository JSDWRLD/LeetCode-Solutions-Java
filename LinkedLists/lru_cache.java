class LRUCache {

    private int capacity;
    private HashMap<Integer, ListNode> cache;

    private ListNode head;
    private ListNode tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        cache = new HashMap<>();

        // Creating our Sentinel Nodes
        this.head = new ListNode(-1, -1);
        this.tail = new ListNode(-1, -1);
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if (!cache.containsKey(key)) 
            return -1;
        
        ListNode curr = cache.get(key);

        // Puts any used cache to the back of list
        // we will always remove from front, cause LRU
        remove(curr);
        add(curr);

        return curr.val;
    }
    
    public void put(int key, int value) {
        // Removal of old key to add updated one
        if (cache.containsKey(key)) {
            ListNode oldNode = cache.get(key);
            remove(oldNode);
        }

        // Adding current node
        ListNode node = new ListNode(key, value);
        cache.put(key, node);
        add(node);

        if (cache.size() > capacity) {
            ListNode realHead = head.next;
            remove(realHead);
            cache.remove(realHead.key);
        }
    }

    public void add(ListNode node) {
        ListNode realTail = tail.prev;
        realTail.next = node;
        node.prev = realTail;

        // Updates our insertNode to our Sentinel Node
        node.next = tail;
        tail.prev = node;
    }

    public void remove(ListNode node) {
        ListNode nextNode = node.next;
        ListNode prevNode = node.prev;

        // Make pointers point to each other to remove
        // node in the middle
        nextNode.prev = prevNode;
        prevNode.next = nextNode;
    }

    private class ListNode {
        private int key;
        private int val;
        ListNode next;
        ListNode prev;

        public ListNode(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }
}
