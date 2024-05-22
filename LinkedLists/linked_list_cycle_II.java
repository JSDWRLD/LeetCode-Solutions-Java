public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return null;

        ListNode fast = head;
        ListNode slow = head;

        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) break;
        }

        if (fast.next != null && fast.next.next != null) {   
            while (head != slow) {
                head = head.next;
                slow = slow.next;
            }
            return head;
        } 

        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return null;
    }
}
