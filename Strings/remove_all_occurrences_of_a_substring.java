class Solution {
    public String removeOccurrences(String s, String part) {
    
        StringBuilder sb = new StringBuilder();
        char lastChar = part.charAt(part.length() - 1);

        int lenPart = part.length();
        for (char c : s.toCharArray()) {
            sb.append(c);
            if (c == lastChar) {
                int currLen = sb.length();
                if (currLen >= lenPart) {
                    int firstIndex = currLen-lenPart;
                    String temp = sb.toString().substring(firstIndex, currLen);

                    if (temp.equals(part)) {
                        sb.setLength(firstIndex);
                    }
                }
            }
        }
        
        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return sb.toString();
    }
}
