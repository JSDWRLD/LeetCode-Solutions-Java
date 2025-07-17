/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    private HashMap<Node, Node> oldToNew = new HashMap<>();
    
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        
        if (oldToNew.containsKey(head)) {
            return oldToNew.get(head);
        }

        Node clone = new Node(head.val, null, null);
        oldToNew.put(head, clone); // avoid cycles
        
        clone.next = copyRandomList(head.next);
        clone.random = copyRandomList(head.random);

        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return clone;
    }
}
