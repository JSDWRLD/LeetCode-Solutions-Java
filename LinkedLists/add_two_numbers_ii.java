class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Reverse both lists
        ListNode l1r = reverse(l1);
        ListNode l2r = reverse(l2);

        // Res will be result node added in reverse order
        // Carry updates anytime we have a value over 10
        int carry = 0;
        ListNode res = null;
        while (l1r != null || l2r != null || carry != 0) {
            // Add to sum each of the nodes values
            int sum = carry;
            if (l1r != null) {
                sum += l1r.val;
                l1r = l1r.next;
            }
            if (l2r != null) {
                sum += l2r.val;
                l2r = l2r.next;
            }

            // Update carry if less than 10, carry = 0
            carry = sum / 10;

            // Create and point new node to old list
            ListNode toAdd = new ListNode(sum % 10);
            toAdd.next = res;
            res = toAdd;
        }

        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return res;
    }

    // This method runs in O(n) time with O(1) space
    private ListNode reverse(ListNode curr) {
        ListNode res = null;
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = res;
            res = curr;
            curr = temp;
        }
        return res;
    }
}
