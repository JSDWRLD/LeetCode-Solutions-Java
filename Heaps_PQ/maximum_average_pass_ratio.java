class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        // max the average pass
        // 1, 2 = 0.5 percent
        // 3, 5 = 0.7
        // 2, 2 = 1.0

        // add and then recalc and redo? store with heap?
        PriorityQueue<int[]> maxHeap = new PriorityQueue<int[]>((a, b) -> {
            double gainA = (double)(a[0] + 1) / (a[1] + 1) - (double)a[0] / a[1];
            double gainB = (double)(b[0] + 1) / (b[1] + 1) - (double)b[0] / b[1];
            // For a max-heap, we want the largest gain to be at the top, so we do b - a
            if (gainB - gainA > 0) return 1;
            if (gainB - gainA < 0) return -1;
            return 0;
        });

        for (int[] c : classes) {
            maxHeap.offer(c);
        }

        for (int i = 0; i < extraStudents; i++) {
            int[] maxGain = maxHeap.poll();
            maxGain[0] += 1;
            maxGain[1] += 1;
            maxHeap.offer(maxGain);
        }

        double total = 0.0;
        while (!maxHeap.isEmpty()) {
            int[] maxGain = maxHeap.poll();
            total += (double)maxGain[0]/(double)maxGain[1];
        }

        // e == extra students
        // Time Complexity: O(e log n + n)
        // Space Complexity: O(n)
        return total/classes.length;
    }
}
