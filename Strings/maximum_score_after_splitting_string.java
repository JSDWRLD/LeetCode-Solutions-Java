class Solution {
    public int maxScore(String s) {
        int n = s.length();
        int result = Integer.MIN_VALUE, leftZeros = 0, rightOnes = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') rightOnes += 1;
        }

        for (int i = 0; i < n-1; i++) {
            if (s.charAt(i) == '0') {
                leftZeros += 1;
            } else {
                rightOnes -= 1;
            }

            result = Math.max(result, leftZeros+rightOnes);
        }

        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return result;
    }
}
