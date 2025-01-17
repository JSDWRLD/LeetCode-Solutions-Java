class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int totalXor = 0;

        for (int n : derived) {
            totalXor ^= n;
        }

        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return totalXor == 0;
    }
}

// every element is used twice, so xor same would = 0
// 0, 1, 0 is original
// 0 xor 1 = 1
// 1 xor 0 = 1
// 0 xor 0 = 0
// derived 110

// 1, 1 derived
// 0, 1 original
// 0 xor 1 = 1
// 1 xor 0 = 1
// original numbers used twice, meaning they cancel out
// derived xor'd sum must equal 0
