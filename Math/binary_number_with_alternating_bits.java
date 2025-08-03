class Solution {
    public boolean hasAlternatingBits(int n) {
        int prev = n & 1;
        n >>= 1;
        while (n > 0) {
            int bit = n & 1;
            if (bit == prev) return false;
            prev = bit;
            n >>= 1;
        }

        // n = number of bits in integer
        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return true;
    }
}
