class Solution {
    public ListNode middleNode(ListNode head) {
        if (head == null || head.next == null) return head;

        int length = 0;
        ListNode curr = head;
        while (curr != null) {
            curr = curr.next;
            length += 1;
        }

        length /= 2;
        curr = head;
        
        int i = 0;
        while (curr != null && i < length) {
            curr = curr.next;
            i += 1;
        }

        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return curr;
    }
}
