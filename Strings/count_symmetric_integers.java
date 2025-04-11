class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int symNums = 0;

        // O(n)
        for (int i = low; i <= high; i++) {
            String num = String.valueOf(i);
            // O(d)
            if (num.length() % 2 == 0 && checkSym(num, num.length())) {
                symNums++;
            }
        }
        
        // Time Complexity: O(n * d)
        // Space Complexity: O(1)
        return symNums;
    }

    // Max digits can be 5 here O(d)
    private boolean checkSym(String num, int len) {
        int mid = len/2;

        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < mid ; i++) {
            // ASCII for '0' is 30, nums 1-9 are 31-39
            leftSum += num.charAt(i) - '0';
            rightSum += num.charAt(i+mid) - '0';
        }

        return leftSum == rightSum;
    }
}
