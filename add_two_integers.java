class Solution {
    public int sum(int a, int b) {
        // Iterate until there is no carry
        while (b != 0) {
            int carry = a & b;
            carry = carry << 1; // Shift carry over

            // Calculate the sum without carry
            a = a ^ b;

            // Update b with the carry value
            b = carry;
        }
        
        // The result is stored in a
        // Time Complexity: O(1)
        // Space Complexity: O(1)
        return a;
    }
}
