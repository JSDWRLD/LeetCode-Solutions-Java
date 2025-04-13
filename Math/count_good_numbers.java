class Solution {
    private long mod = 1000000007;;
    // N is an upper bound on the length of the digit
    public int countGoodNumbers(long n) {
        long half = n/2;
        // 5 evens, 4 odds for numbers 0-9, aka each digit
        long result = modPow(4, half);

        long odds;
        if (n % 2 == 0) {
            odds = modPow(5, half);
        } else {
            odds = modPow(5, half+1);
        }

        result = (result*odds) % mod;

        // Time Complexity: O(log n)
        // Space Complexity: O(1)
        return (int)(result % mod);
    }

    // Key is to use fast exponential
    private long modPow(long base, long exp) {
        long result = 1;
        base = base;

        while (exp > 0) {
            if (exp % 2 == 1) {
                result = (result*base) % mod;
            }
            base = (base*base) % mod;
            exp /= 2; // log exponential
        } 

        return result;
    }
}
