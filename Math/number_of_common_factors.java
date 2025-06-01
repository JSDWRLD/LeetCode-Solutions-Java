class Solution {
    public int commonFactors(int a, int b) {
        int res = 0;
        for (int i = 1; i <= Math.min(a,b); i++) {
            if (a % i == 0 && b % i == 0) res++;
        }

        // n == min of a,b
        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return res;
    }
}
