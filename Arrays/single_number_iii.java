class Solution {
    public int[] singleNumber(int[] nums) {
        int totalXOR = 0;
        for (int n : nums) {
            totalXOR = totalXOR ^ n;
        }

        // Finding the right most bit to partition our array
        int rightB = 1;
        while ((totalXOR & rightB) == 0) {
            // Shift 1 bit
            rightB = rightB << 1;
        }
        
        int numOne = 0, numTwo = 0;
        for (int n : nums) {
            // Separation of numbers that have the bit set vs not having
            if ((n & rightB) != 0) {
                numOne ^= n;
            } else {
                numTwo ^= n;
            }
        }

        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return new int[] {numOne, numTwo};
    }
}
