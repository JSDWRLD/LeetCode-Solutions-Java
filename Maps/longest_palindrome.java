class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>();

        int result = 0;
        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                set.remove(c);
                result += 2;
            } else {
                set.add(c);
            }
        }

        if (!set.isEmpty()) result += 1;

        // Time Complexity: O(n)
        // Space Complexity: O(1) -> 52 possible chars
        return result;
    }
}
