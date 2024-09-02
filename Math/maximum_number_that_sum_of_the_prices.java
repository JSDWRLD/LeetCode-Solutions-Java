class Solution {
    // Optimized method to count set bits at specific intervals
    private long countSetBitsAtPositions(long num, int x) {
        long totalSetBits = 0;
        // Iterates until 2^i > num, example 2^4 is = 16, 
        // growth of function is fast
        // 00000010
        for (int i = x - 1; (1L << i) <= num; i += x) {
            // Position to count is i, which is a multiple of x
            long mask = 1L << i;
            
            // We pass in the current bit mask for example 0001 or 0010
            // then when we get our result we add to our total, thats our
            // accumulated price
            totalSetBits += getNumSetBit(num, mask);
        }
        return totalSetBits;
    }

    // Helper method to calculate number of set bits for a specific bit mask
    private long getNumSetBit(long num, long i) {
        // The bits in the ith position (0 indexed) repeat every group size
        // for example if i = 3, the bits in the 3rd position 
        // would repeat every 8 numbers, because 2^3 is 8 aka the 3rd position
        long groupSize = i << 1;
        long fullGroups = (num + 1) / groupSize;

        // After checking our full groups, we want to also consider the remaining
        // for example 13 has 1 full group with 6 remainder
        long remainder = (num + 1) % groupSize;

        // full groups * i will give the amount of set bits in ith position
        // in the example above 6 remainder - i which is mask at 
        // bit location 2 (0 index), value of that is 4 base 2
        // 6 - 4 = 2, so we add 2 more bits, 12 and 13
        return fullGroups * i + Math.max(0, remainder - i);
    }

    // Binary search to find the maximum cheap number
    public long findMaximumNumber(long k, int x) {
        long low = 1;
        long high = (long) 1e15; // 10^15
        long result = 0;

        while (low <= high) {
            long mid = low + (high - low) / 2;
            long accumulatedPrice = countSetBitsAtPositions(mid, x);

            if (accumulatedPrice <= k) {
                result = mid;  // mid is a valid candidate
                low = mid + 1; // Search in the upper half
            } else {
                high = mid - 1; // Search in the lower half
            }
        }
        // 10101010
        return result;
    }
}
