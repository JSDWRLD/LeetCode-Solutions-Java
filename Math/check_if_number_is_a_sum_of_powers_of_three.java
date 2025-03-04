class Solution {
    public boolean checkPowersOfThree(int n) {
        // Two decisions add or skip so 2^ something
        // we know that we consider up to powers of 3 up to n
        // Binary recursive tree wher ethe depth is log n base 3
        // Time Complexity: O(2^logn)
        // Space is based on the recursion stack at any given time at most log n base 3
        // Space Complexity: O(logn)
        return backtrack(n, 0);
    }

    private boolean backtrack(int n, int pow) {
        // We successly found a path of powers of 3 that sum to n
        if (n == 0) return true;

        // Invalid path
        int currPower = (int)Math.pow(3, pow);
        if (currPower > n) return false;

        // Add current power or skip
        boolean addCurrPower = backtrack(n - currPower, pow+1);
        boolean skipCurrPower = backtrack(n, pow+1);
        
        // If any path is true then return true
        return addCurrPower || skipCurrPower;
    }
}
