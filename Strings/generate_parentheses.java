class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();

        // backtracking function call
        parenBuilder(n, res, 0, 0, "");

        // Based on the Catalan math theory, each decision makes 2 recursive calls
        // Time Complexity: O(4^n / sqrt(n))
        // Space Complexity: O(n)
        return res;
    }

    // Method create VALID parenthesis using a decision tree via backtracking
    public void parenBuilder(int n, List<String> res, int openP, int closeP, String paren){
        if(paren.length() == n*2){
            res.add(paren);
            // exit out of recursion, do not fall through to other conditions
            return;
        }

        // at each decision the tree will fall through and check second condition
        // until it is no longer valid
        // we can put as many open parenthesis up until n
        if(openP < n){
            parenBuilder(n, res, openP + 1, closeP, paren + "(");
        }

        // we can put close parenthesis as long as its count is less than open parenthesis
        if(closeP < openP){
            parenBuilder(n, res, openP, closeP + 1, paren + ")");
        }
    }
}
