class Solution {
    public int diagonalPrime(int[][] nums) {
        int res = 0;
        
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int numOne = nums[i][i];
            int numTwo = nums[i][n-i-1];
            if (isPrime(numOne)) res = Math.max(res, numOne);
            if (isPrime(numTwo)) res = Math.max(res, numTwo);
        }

        // N = largest prime number diagonal
        // M = number of diagonals
        // Time Complexity: O(m * sqrt(n))
        return res;
    }

    private boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i*i<= n; i+=6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }
}
