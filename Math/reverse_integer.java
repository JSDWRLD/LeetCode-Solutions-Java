class Solution {
    public int reverse(int x) {
        // check for negative or positive
        int sign;
        if (x > 0) {
            sign = 1;
        } else {
            sign = -1;
            x = Math.abs(x);
        }

        int result = 0;
        while (x > 0) {
            int remainder = x % 10;

            // We must check if our next operation will cause a overflow,
            // since we are multiplying by 10 and adding remainder to result.
            if (result > (Integer.MAX_VALUE - remainder) / 10) return 0;
            
            result = result * 10 + remainder;
            x /= 10;
        }

        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return result * sign;
    }
}
