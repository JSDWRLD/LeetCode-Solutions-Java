class Solution {
    public String processStr(String s) {
        StringBuilder sb = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            if (c == '*' && sb.length() > 0) {
                sb.setLength(sb.length() - 1);
            }
            else if (c == '#') {
                sb.append(sb.toString());
            }
            else if (c == '%') {
                sb = reverse(sb.toString());
            }
            else if (Character.isLetter(c) && Character.isLowerCase(c)) {
                sb.append(c);
            }
        }
        
        // R is the maximum a reversal can be
        // Time Complexity: O(n * r)
        // Space Complexity: O(n)
        return sb.toString();
    }

    private StringBuilder reverse(String s) {
        StringBuilder sb = new StringBuilder();

        char[] sChars = s.toCharArray();
        for (int i = sChars.length-1; i >= 0; i--) {
            sb.append(sChars[i]);
        }

        return sb;
    }
}
