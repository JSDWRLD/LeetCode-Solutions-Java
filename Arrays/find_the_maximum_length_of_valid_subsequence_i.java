class Solution {
    public int maximumLength(int[] nums) {
        int[][] parityPattern = { { 0, 0 }, { 0, 1 }, { 1, 0 }, { 1, 1 } };

        int result = 0;
        for (int[] pattern : parityPattern) {
            int subsequenceLen = 0;
            for (int n : nums) {
                // if the current num mod 2 matches its position in the pattern's mod
                // then increment the length
                if (n % 2 == pattern[subsequenceLen % 2]) {
                    subsequenceLen++;
                }
            }

            result = Math.max(result, subsequenceLen);
        }

        // Time Complexity: O(4n) -> O(n)
        // Space Complexity: O(1)
        return result;
    }
}

// 4 possible cases based on mod 2
// all elements odd , remainder same
// all elements even, remainder same
// all odd index = odd + even at even index, remainder = 1 same
// reverse of the above
