class Solution {
    public char kthCharacter(int k) {
        // Time Complexity: O(k)
        // Space Complexity: O(k)
        return recurse(new StringBuilder("a"), k).charAt(k - 1);
    }
    
    public String recurse(StringBuilder sb, int k) {
        if (sb.length() >= k) return sb.toString();
        
        int len = sb.length();
        for (int i = 0; i < len; i++) {
            sb.append((char) ('a' + ((sb.charAt(i) - 'a') + 1) % 26));
        }

        return recurse(sb, k);
    }
}
