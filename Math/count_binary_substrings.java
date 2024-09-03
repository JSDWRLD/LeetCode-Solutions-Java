class Solution {
    public int countBinarySubstrings(String s) {
        // Count is for current bit, previous is is the bit changes
        int count = 1, prev = 0, result = 0;
        for (int i = 1; i < s.length(); i++) {
            // Keep counting bits if theyre equal
            if (s.charAt(i-1) == s.charAt(i))
                count++;
            else { // If there is a change then we calculate the min
                result += Math.min(count, prev);
                prev = count;
                count = 1;
            }
        }

        // Add leftover calculation to result
        result += Math.min(count, prev);
        return result;
    }
}
