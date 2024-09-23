class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && 
            divisor == -1) 
            return Integer.MAX_VALUE;

        int negatives = 2;
        if (dividend > 0) {
            negatives -= 1;
            dividend = -dividend;
        } 
        if (divisor > 0) {
            negatives -= 1;
            divisor = -divisor;
        } 

        int quotient = 0;
        while (divisor >= dividend) {
            int val = divisor;
            int powerOfTwo = -1;

            while (val >= Integer.MIN_VALUE/2 &&
                val + val >= dividend) {
                    val += val;
                    powerOfTwo += powerOfTwo;
                }

            dividend -= val;
            quotient += powerOfTwo;
        }

        if (negatives != 1) return -quotient;
        return quotient;
    }
}

