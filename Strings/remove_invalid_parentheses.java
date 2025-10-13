class Solution {
    private Set<String> validParens;
    private int minOps;
    
    public List<String> removeInvalidParentheses(String s) {
        validParens = new HashSet<>(); // avoid dupes
        minOps = Integer.MAX_VALUE;
        backtrack(s, 0, 0, 0, 0, new StringBuilder());

        // Time: O(2^n)
        // Space: O(n), recursion, not result array
        return new ArrayList<>(validParens);
    }

    private void backtrack(
        String s, 
        int i, 
        int open, 
        int close, 
        int removed, 
        StringBuilder path
    ) {
        // check conditions to add path
        if (i == s.length()) {
            
            if (open == close && removed <= minOps) {
                String validParen = path.toString();

                // we must clear
                if (removed < minOps) {
                    validParens.clear();
                    minOps = removed;
                }

                validParens.add(validParen);
            }
        } else {
            char curr = s.charAt(i);
            int pathLen = path.length();
            
            if (curr != '(' && curr != ')') {
                path.append(curr); // add non paren
                backtrack(s, i+1, open, close, removed, path);
                path.deleteCharAt(pathLen);  // remove
            }
            else {
                // remove the curr character and try
                backtrack(s, i+1, open, close, removed+1, path);
                
                // add the curr char
                path.append(curr);

                if (curr == '(') {
                    backtrack(s, i+1, open+1, close, removed, path);
                } else if (close < open) {
                    // only recurse if its close < open
                    backtrack(s, i+1, open, close+1, removed, path);
                }

                // undo adding
                path.deleteCharAt(pathLen);
            }
        }
    }
}
