class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        int sum = l1.val + l2.val + carry;
        if(sum > 9){
            carry = 1;
            sum = sum % 10;
        } else {
            carry = 0;
        }
        ListNode res = new ListNode(sum);
        ListNode pointer = res;

        l1 = l1.next;
        l2 = l2.next;
        
        while(l1 != null || l2 != null){
            int oneVal = (l1 != null) ? l1.val : 0;
            int twoVal = (l2 != null) ? l2.val : 0;
            sum = oneVal + twoVal + carry;

            if(sum > 9){
                carry = 1;
                sum = sum % 10;
            } else {
                carry = 0;
            }

            ListNode temp = new ListNode(sum);
            pointer.next = temp;

            pointer = pointer.next;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }

        if(carry == 1) pointer.next = new ListNode(carry);

        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return res;
    }
}
