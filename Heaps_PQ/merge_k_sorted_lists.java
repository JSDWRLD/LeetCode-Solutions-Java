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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((n1, n2) -> n1.val - n2.val);

        for (ListNode root : lists) {
            if (root != null) minHeap.add(root);
        }

        ListNode resultHead = null, resultTail = null;
        while(!minHeap.isEmpty()) {
            ListNode temp = minHeap.poll();

            if (resultHead == null) {
                resultHead = resultTail = temp;
            } else {
                resultTail.next = temp;
                resultTail = resultTail.next;
            }

            if (temp.next != null) minHeap.add(temp.next);
        }

        // Time Complexity: O(n * log k)
        // Space Complexity: O(k)
        return resultHead;
    }
}
