class Solution {
    public int minimizeXor(int num1, int num2) {
        int oneBits = countBits(num1);
        int twoBits = countBits(num2);
        if (oneBits == twoBits) return num1;

        // Time Complexity: O(1), at most 32 bits for an integer
        // Space Complexity: O(1)
        if (oneBits > twoBits) return subSetBits(num1, oneBits - twoBits);
        return addSetBits(num1, twoBits - oneBits);
    }


    private int addSetBits(int num, int bitsToAdd) {
        int bitPos = 0;
        while (bitsToAdd > 0) {
            // while current bit == 1 shift position left
            while ((num >> bitPos & 1) == 1) bitPos++;  // Find the next bit that is 0
            num = num | (1 << bitPos);   // Set the bit at position bitPos to 1
            bitsToAdd--;
        }

        return num;
    }
    
    private int subSetBits(int num, int bitsToSub) {
        int bitPos = 0;
        while (bitsToSub > 0) {
            num = num & (num - 1); // Remove the rightmost set bit (1)
            bitsToSub--;
        }

        return num;
    }

    private int countBits(int num) {
        int count = 0;
        while (num != 0) {
            count += num & 1;
            num = num >> 1; // right shift by 1
        }
        return count;
    }
}
