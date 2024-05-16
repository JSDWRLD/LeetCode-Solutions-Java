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
    public void reorderList(ListNode head) {
        
        ListNode fast = head;
        ListNode slow = head;

        // after this slow will contain middle node
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        // reverse second half
        ListNode secondHalf = reverse(slow);
        ListNode firstHalf = head;

        while(firstHalf != null && secondHalf != null){
            ListNode temp = firstHalf.next;
            firstHalf.next = secondHalf;
            firstHalf = temp;

            temp = secondHalf.next;
            secondHalf.next = firstHalf;
            secondHalf = temp;
        }

        // set the next of the last node to 'null'
        if(firstHalf != null) {
            firstHalf.next = null;
        }

        // Time Complexity: O(n)
        // Space Complexity: O(1)
    }

    public ListNode reverse(ListNode curr){
        ListNode prev = null;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}
