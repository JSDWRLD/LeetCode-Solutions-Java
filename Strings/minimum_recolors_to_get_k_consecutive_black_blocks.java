class Solution {
    public int minimumRecolors(String blocks, int k) {
        int minOps = Integer.MAX_VALUE, n = blocks.length();

        int start = 0, whiteCount = 0, blackCount = 0;
        for (int end = 0; end < n; end++) {

            if (blocks.charAt(end) == 'W') whiteCount += 1;
            else blackCount += 1;

            if (end - start + 1 == k) {
                minOps = Math.min(minOps, whiteCount);

                if (blocks.charAt(start) == 'W') whiteCount -= 1;
                else blackCount -= 1;
                
                start++;
            }
        }

        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return minOps;
    }
}
