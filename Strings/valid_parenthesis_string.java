class Solution {
    public boolean checkValidString(String s) {
        
        // keep upper and lower bounds of '('
        int minOpen = 0;  // Minimum number of unmatched '('
        int maxOpen = 0;  // Maximum number of unmatched '('

        for (char c : s.toCharArray()) {
            if (c == '(') {
                minOpen++;  // definitely one more '(' to match
                maxOpen++;  // possibly one more '(' to match
            } else if (c == ')') {
                minOpen--;  // possibly closing a '('
                maxOpen--;  // definitely closing a '('
            } else if (c == '*') {
                // two cases the star can be open or close paren
                minOpen--;      // assume '*' is ')'
                maxOpen++;      // assume '*' is '('
            }

            // we matched this condition too much: c == ')'
            if (maxOpen < 0) return false;  // too many ')' overall

            // always reset lowerbound
            if (minOpen < 0) minOpen = 0;   // can't go below 0
        }
        
        return minOpen == 0;  // if we can close all open '('
    }
}
