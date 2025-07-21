class Solution {

    public String makeFancyString(String s) {
        // If the size of the string is less than 3, return it.
        if (s.length() < 3) {
            return s;
        }

        StringBuilder sb = new StringBuilder();
        // Start by appending the first two characters to StringBuilder.
        sb.append(s.charAt(0)).append(s.charAt(1));

        // Iterate from the 3rd character onwards.
        for (int i = 2; i < s.length(); ++i) {
            // If the current character is not equal to the previously inserted
            // two characters, then we can add it to the StringBuilder.
            if (
                s.charAt(i) != sb.charAt(sb.length() - 1) ||
                s.charAt(i) != sb.charAt(sb.length() - 2)
            ) {
                sb.append(s.charAt(i));
            }
        }

        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return sb.toString();
    }
}
