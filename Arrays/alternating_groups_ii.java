class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int len = colors.length;
        // Create an extra space array to check end values of colors
        int[] extend = new int[len*2];
        for (int i = 0; i < len; i++) {
            extend[i] = colors[i];
            extend[i+len] = colors[i];
        }

        int result = 0, count = 1;

        // Iterate up to original length + k - 1 to check values
        for (int i = 1; i < len+k-1; i++) {

            // If previous is not same we increment count, else we reset
            if (extend[i] != extend[i-1]) count++;
            else count = 1;
            
            // Anytime count is equal to or over meaning we have a chain, then result++
            if (count >= k) result++;
        }

        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return result;
    }
}
