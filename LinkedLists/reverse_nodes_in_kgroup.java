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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k <= 1 || head.next == null) return head;

        ListNode curr = head, prev = null;
        while (true) {
            ListNode lastNodePrevSub = prev;
            ListNode lastNodeCurrSub = curr;

            // This code simply doesnt modify remainder
            ListNode check = curr;
            int count = 0;
            while (check != null && count < k) {
                check = check.next;
                count++;
            }
            if (count < k) break;

            for (int i = 0; curr != null && i < k; i++) {
                ListNode ahead = curr.next;
                curr.next = prev;
                prev = curr;
                curr = ahead;
            }

            if (lastNodePrevSub != null) {
                lastNodePrevSub.next = prev;
            } else {
                head = prev;
            }

            lastNodeCurrSub.next = curr;

            if (curr == null) break;
            prev = lastNodeCurrSub;
        }

        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return head;
    }
}
