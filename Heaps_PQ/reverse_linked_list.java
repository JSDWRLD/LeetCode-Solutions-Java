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
    public ListNode reverseList(ListNode head) {
        // creating temporary pointers
        ListNode curr = head;
        // one behind
        ListNode prev = null;

        while(curr != null){
            // save the node in front before erasing
            ListNode forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }

        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return prev;
    }
}