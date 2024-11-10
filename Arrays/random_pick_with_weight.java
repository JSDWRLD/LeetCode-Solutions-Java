class Solution {
    
    private int[] prefixSum;
    private Random rand;
    private int totalSum;

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public Solution(int[] w) {
        this.prefixSum = new int[w.length];
        this.rand = new Random();

        int runningSum = 0;
        for (int i = 0; i < w.length; i++) {
            runningSum += w[i];
            prefixSum[i] = runningSum;
        }

        this.totalSum = runningSum;
    }
    
    // Time: O(log n)
    // Space Complexity: O(1)
    public int pickIndex() {
        // Make the target an actual value,
        // if sum is 7, then target should be 1-7
        int target = rand.nextInt(totalSum)+1;

        int start = 0, end = prefixSum.length;
        while (start < end) {
            int mid = start + (end - start) / 2;

            if (target == prefixSum[mid]) return mid;
            else if (target > prefixSum[mid]) start = mid+1;
            else end = mid;
        }

        // If start > end this means that our start pointer is
        // in the range we wanted so return that index
        return start;
    }
}
