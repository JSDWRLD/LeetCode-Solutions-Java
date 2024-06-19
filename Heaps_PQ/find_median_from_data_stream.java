class MedianFinder {
    private PriorityQueue<Integer> minHeap;
    private PriorityQueue<Integer> maxHeap;
    private int total;

    public MedianFinder() {
        // Intialize Two Heaps
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        total = 0;
    }
    
    // Add is O(log n)
    public void addNum(int num) {
        // We default to adding to MAX or num smaller than max we add
        if (maxHeap.isEmpty() || maxHeap.peek() > num) maxHeap.offer(num);
        else minHeap.offer(num); // If num > MAX

        // If there is an imbalance take the root and add to opposite
        if (maxHeap.size() > minHeap.size() + 1) {
            minHeap.offer(maxHeap.poll());
        } else if (maxHeap.size() < minHeap.size()) {
            maxHeap.offer(minHeap.poll());
        }

        total++;
    }

    public double findMedian() {
        if (minHeap.size() == maxHeap.size()) {
            // return average of two middle numbers
            return (minHeap.peek() + maxHeap.peek()) / 2.0;
        }

        // If the length is odd we get max or min of the biggest heap
        if (minHeap.size() > maxHeap.size()) {
            return minHeap.peek();
        } 

        // Time Complexity of FindMedian: O(1)
        // Time Complexity of AddNum: O(log n)
        // Space Complexity: O(n)
        return maxHeap.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
