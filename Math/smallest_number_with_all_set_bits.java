class Solution {
    public int smallestNumber(int n) {
        // count how many bits times we can shift
        // then do 2^3 - 1
        int bits = 0;
        while (n > 0) {
            bits++;
            n >>= 1; 
        }

        // n bits in a given number n
        // Time: O(n)
        // Space: O(1)
        return (int)Math.pow(2,bits) - 1;
    }
}
