class Solution {
    public boolean reorderedPowerOf2(int n) {
        int[] currArr = count(n);
        // Since we can change order,
        // only thing that matters is same number of digits
        for (int i = 0; i <= 32; i++) {
            int next = (int)Math.pow(2, i);
            if (Arrays.equals(currArr, count(next))) return true;
        }

        // Time Complexity: O(log n)
        // Space Complexity: O(log n)
        return false;
    }

    private int[] count(int n) {
        int[] ans = new int[10];
        while (n > 0) {
            ans[n%10]++;
            n /= 10;
        }
        return ans;
    }
}
