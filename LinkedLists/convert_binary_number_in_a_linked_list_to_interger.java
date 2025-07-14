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
    public int getDecimalValue(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }

        int result = 0, power = 1;
        while (prev != null) {
            if (prev.val == 1) {
                result += power;
            }
            power *= 2;
            prev = prev.next;
        }

        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return result;
    }
}
