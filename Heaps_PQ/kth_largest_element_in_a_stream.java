class KthLargest {
    final private PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    final private int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        for (int n : nums) {
            add(n);
        }

        // Time Complexity: O(n log n)
        // Space Complexity: O(k)
    }
    
    public int add(int val) {
        if (minHeap.size() < k) minHeap.offer(val);
        else if (minHeap.peek() < val) {
            minHeap.poll();
            minHeap.offer(val);
        }

        return minHeap.peek();
    }
}
