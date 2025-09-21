class Solution {
    public Node flatten(Node head) {
        // ll is doubly/
        // next, prev, child
        // dfs, maintain the levels
        // each level, we will iterate until curr == null 
        // child:
            // store head, and call dfs on the child for the tail
        if (head == null) return head;
        dfs(head);

        // Time Complexity: O(n)
        // Space Complexity: O(n), call stack
        return head;
    }

    // each level returns the tail
    private Node dfs(Node head) {
        Node curr = head;
        Node tail = head;
        
        while (curr != null) {
            Node originalNext = curr.next;
            // No child
            if (curr.child == null) {
                tail = curr;
            }
            // Child, flatten this level
            else {
                Node childHead = curr.child;
                Node childTail = dfs(childHead); // will return tail

                curr.next = childHead;
                childHead.prev = curr;
                curr.child = null; // remove this 

                // link other half if exists
                if (originalNext != null) {
                    childTail.next = originalNext;
                    originalNext.prev = childTail;
                }

                curr = childTail;
                tail = childTail;
            } 

            curr = curr.next;
        }

        return tail;
    }
}
