class Solution {
    public int lastStoneWeight(int[] stones) {
        if (stones.length == 1) return stones[0];
        // By default PriorityQueue in Java is a minHeap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

        // Iteration n, adding is log n
        for (int n : stones) {
            maxHeap.offer(n);
        }

        while (maxHeap.size() > 1) {
            int y = maxHeap.poll();
            int x = maxHeap.poll();
            if (x < y) {
                maxHeap.offer(y - x);
            }
        }
        
        if (maxHeap.size() == 0) return 0;

        // Time Complexity: O(n log n)
        // Space Complexity: O(n)
        return maxHeap.peek();
    }
}
