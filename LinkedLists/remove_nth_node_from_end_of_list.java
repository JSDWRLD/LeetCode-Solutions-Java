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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        // empty list we return null
        if(head == null ) return null;
        
        // get length of list
        int length = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            length++;
        }

        // base case where head needs to be removed
        if (length == n){
            head = head.next;
            return head;
        }

        // calculate position of nth node from end
        int pos = length - n; 
        ListNode curr = head;
        ListNode prev = null;

        // iterate until our curr pointer points at the node to remove
        for(int i = 0; i < pos; i++){
            prev = curr;
            curr = curr.next;
        }

        // removing the node
        prev.next = curr.next;

        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return head;
    }
}
