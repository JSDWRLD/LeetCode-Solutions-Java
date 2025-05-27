class Solution {
    public int differenceOfSums(int n, int m) {
        int num1 = 0, num2 = 0;
        for (int i = 1; i <= n; i++) {
            if (i % m != 0) num1 += i;
            else num2 += i;
        }

        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return num1 - num2;
    }
}
