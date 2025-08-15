class Solution {
    public boolean isPowerOfFour(int n) {
        for (int i = 0; i <= 15; i++) {
            if (Math.pow(4,i) == n) return true;
        }

        // Time Complexity: O(1)
        // Space Complexity: O(1)
        return false;
    }
}
