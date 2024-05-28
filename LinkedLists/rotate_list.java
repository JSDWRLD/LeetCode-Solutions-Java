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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;

        // Find length
        ListNode last = head;
        int length = 1;
        while (last.next != null) {
            last = last.next;
            length++;
        }

        // Rotations is equal to k % length and will help reduce uncessary rotations
        k = k % length;
        // Create a circular loop by pointing our last node to head
        last.next = head;

        // Find the new tail based on length - new k value
        ListNode nTail = head;
        for (int i = 1; i < length - k; i++) {
            nTail = nTail.next;
        }

        // Set out head equal to the node in front of the tail, then set tail to null
        head = nTail.next;
        nTail.next = null;

        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return head;
    }
}
