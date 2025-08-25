class Solution {
    public int[] closestDivisors(int num) {
        int[] res1 = findPair(num+1);
        int[] res2 = findPair(num+2);

        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return Math.abs(res1[1] - res1[0]) <= Math.abs(res2[1] - res2[0]) ?
            res1 : res2;
    }

    private int[] findPair(int n) {
        int sqrt = (int)Math.sqrt(n);

        for (int i = sqrt; i > 0; i--) {
            if (n % i == 0) {
                return new int[] {i, n/i};
            }
        }

        return new int[] {1, n};
    }
}
