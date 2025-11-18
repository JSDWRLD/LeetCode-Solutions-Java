class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int n = bits.length;
        int i = 0;
        while (i < n-1) {
            // skip 1 for a 0 (1bit)
            // skip 2 for a 1 (2bit)
            i += bits[i] + 1;
        }
        
        // if we skip and land exactly on last num
        // its a one bit
        // Time: O(n)
        // Space: O(1)
        return i == n-1;
    }
}
