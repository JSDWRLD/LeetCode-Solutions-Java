class Solution {
    public boolean hasSpecialSubstring(String s, int k) {
        int n = s.length();

        for (int i = 0; i <= n - k; i++) {
            char currentChar = s.charAt(i);
            boolean valid = true;

            // Check that the next k characters are all the same
            // k iters
            for (int j = i; j < i + k; j++) {
                if (s.charAt(j) != currentChar) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                boolean leftOK = (i == 0 || s.charAt(i - 1) != currentChar);
                boolean rightOK = (i + k == n || s.charAt(i + k) != currentChar);

                if (leftOK && rightOK) {
                    return true;
                }
            }
        }

        // Time Complexity: O(n * k)
        // Space Complexity: O(1)
        return false;
    }
}
