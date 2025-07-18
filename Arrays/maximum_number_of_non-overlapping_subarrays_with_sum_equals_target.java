class Solution {
    public int maxNonOverlapping(int[] nums, int target) {
        HashMap<Integer, Integer> seenSum = new HashMap<>();
        seenSum.put(0, -1);
        int prefixSum = 0, last = -1, countSubs = 0;
        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            // If we have previous found that val = sum-target
            // then that means that it exist previously, check indexes
            if (seenSum.containsKey(prefixSum-target) 
                && last <= seenSum.get(prefixSum-target)) 
            {
                last = i;
                countSubs++;
            }

            // Put current prefix sum into the seen map with its index
            seenSum.put(prefixSum, i);
        }

        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return countSubs;
    }
}
// prefix sum
// 1, 2, 3, 4, 5
// subtract subarray num * target each iter
