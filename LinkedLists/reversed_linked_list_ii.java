/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head.next == null || left == right) return head;

        // Find start position to reverse
        ListNode curr = head, prev = null;
        for (int i = 0; curr != null && i < left - 1; i++) {
            prev = curr;
            curr = curr.next;
        }

        ListNode firstHalf = prev;
        ListNode reverseLastNode = curr;

        // Apply reversal 
        ListNode temp = null;
        for (int i = 0; curr != null && i < right - left + 1; i++) {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        // Connect the firstHalf to the last node of the reversal (prev)
        if (firstHalf != null) {
            firstHalf.next = prev;
        } else {
            // this means that left == 1, we have to update the head to be the
            // last node of the reversal
            head = prev;
        }

        // Connect the last reversed node to the secondHalf (curr)
        reverseLastNode.next = curr;

        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return head;
    }
}
