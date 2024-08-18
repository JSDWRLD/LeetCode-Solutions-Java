class Solution {
    public int mySqrt(int x) {
        if (x == 0) return 0;

        int start = 0, end = x;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Need to use long here cause integer overflow
            if ((long) mid*mid == (long)x) 
                return mid;
            else if ((long) mid*mid < (long) x)
                start = mid + 1; 
            else
                end = mid - 1;
        }

        // If we do not find a sufficient number we return the end pointer
        // because end and start overlap and meaning the
        // closest number is it, for instance 8 sqrt is 2
        // Time Complexity: O(log n)
        // Space Complexity: O(1)
        return end;
    }
}
