class Solution {
    public int minOperations(int[] nums, int k) {
        int n = nums.length;
        if (n< 0 || (n == 1 && nums[0] < k)) return -1;

        // Use a long because if working with large nums, overflow int
        // int 2^32
        PriorityQueue<Long> minHeap = new PriorityQueue<Long>();
        for (int num : nums) minHeap.add((long)num); // n log n

        int ops = 0;
        while (minHeap.peek() < k ) {
            long x = minHeap.poll();
            long y = minHeap.poll();
            long temp = Math.min(x, y) * 2 + Math.max(x,y);
            minHeap.add(temp);
            ops += 1;
        }

        // Time Complexity: O(n log n)
        // Space Complexity: O(n)
        return ops;
    }
}
