class Solution {
    public int[] getNoZeroIntegers(int n) {
        for (int i = 1; i < n; i++) {
            int j = n - i;
            if (isNonZero(i) && isNonZero(j)) {
                    return new int[] {i, j};
            }
        }

        // k is the max digits in a num
        // 10^4 = 4 digits
        // Time Complexity: O(n * k)
        // Space Complexity: O(1)
        return new int[] {-1,-1};
    }

    private boolean isNonZero(int x) {
        while (x > 0) {
            if (x % 10 == 0) return false;
            x /= 10;
        }
        return true;
    }
}
