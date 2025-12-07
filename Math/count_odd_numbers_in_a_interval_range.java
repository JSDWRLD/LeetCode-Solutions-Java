class Solution {
    public int countOdds(int low, int high) {
        int diff = high - low + 1;
        int res = diff/2;
        // range is even = diff/2 odds
        // odd
        if (diff % 2 == 0 || high % 2 == 0 && low % 2 == 0) return res; 
        
        // Time: O(1) 
        // Space: O(1)
        return res + 1;
    }
}
