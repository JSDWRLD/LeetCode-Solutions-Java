class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;
        int[] dp = new int[n];

        int maxSubSize = -1, maxSubI = -1;

        for (int j = 0; j < n; j++) {
            int currSize = 0;

            // Previous numbers check if it 
            // follows the condition
            for (int i = 0; i < j; i++) {
                if (nums[j] % nums[i] == 0 && currSize < dp[i]) {
                    currSize = dp[i];
                }
            }

            dp[j] = currSize+1;
            if (maxSubSize < dp[j]) {
                maxSubSize = dp[j];
                maxSubI = j;
            }
        }

        // Construct result
        List<Integer> result = new LinkedList<>();
        int tail = nums[maxSubI];
        for (int i = maxSubI; i >= 0; i--) {
            if (maxSubSize == 0) break;

            if (tail % nums[i] == 0 && dp[i] == maxSubSize) {
                result.addFirst(nums[i]);
                tail = nums[i];
                maxSubSize -= 1;
            }
        }

        // Two Conditions: largest in subset % i == 0 we can count everything
        // smallest in i % smallest in subset we can count everything
        // Time Complexity: O(n^2)
        // Space Complexity: O(n)
        return result;
    }
}
