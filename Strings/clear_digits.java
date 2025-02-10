class Solution {
    public String clearDigits(String s) {

        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c) && sb.length() > 0) {
                sb.setLength(sb.length() - 1);
            } else {
                sb.append(c);
            }
        }
        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return sb.toString();
    }
}
