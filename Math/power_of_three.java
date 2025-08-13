class Solution {
    public boolean isPowerOfThree(int n) {
        for (int i = 0; i <= 20; i++) {
            if (n == Math.pow(3, i)) return true;
        }

        // Time Complexity: O(1)
        // Space Complexity: O(1)
        return false;
    }
}
