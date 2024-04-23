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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode dummyCurr = dummy;

        ListNode curr1 = list1;
        ListNode curr2 = list2;
        while(curr1 != null && curr2 != null){
            if(curr1.val < curr2.val){
                dummyCurr.next = curr1;
                curr1 = curr1.next;
            } else {
                dummyCurr.next = curr2;
                curr2 = curr2.next;
            }
            dummyCurr = dummyCurr.next;
        }

        // adding remainder because one of the lists hit null before the other
        if(curr1 != null){
            dummyCurr.next = curr1;
        } else if (curr2 != null){
            dummyCurr.next = curr2;
        }

        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return dummy.next;
    }
}
