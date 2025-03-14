/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return intersect(headA, headB, headA, headB);
    }
    public ListNode intersect(ListNode aCopy, ListNode bCopy, ListNode headA, ListNode headB) {

        if (aCopy == null && bCopy == null) {
            return null;
        } else  if(aCopy == null) {
            aCopy = headB;
        } else if (bCopy == null) {
            bCopy = headA;
        }
        if (aCopy == bCopy) {
            return aCopy;
        }
        ListNode res = intersect(aCopy.next, bCopy.next, headA, headB);
        return res;
    }
}
