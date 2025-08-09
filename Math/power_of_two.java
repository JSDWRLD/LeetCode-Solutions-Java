class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        for (int i = 0; i <= 32; i++) {
            if (Math.pow(2, i) == n) return true;
        }

        // Time Complexity: O(1)
        // Space Complexity: O(1)
        return false;
    }
}
