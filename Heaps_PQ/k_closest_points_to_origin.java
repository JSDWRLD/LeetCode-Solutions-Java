class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((p1, p2) -> dist(p2[0],p2[1]) - dist(p1[0], p1[1]));
        for (int i = 0; i < k; i++) {
            maxHeap.add(points[i]);
        }

        for (int i = k; i < points.length; i++) {
            if (dist(maxHeap.peek()[0], maxHeap.peek()[1]) > dist(points[i][0], points[i][1])) {
                maxHeap.poll();
                maxHeap.add(points[i]);
            }
        }

        int[][] res = new int[k][2];
        for (int i = 0; i < k; i++) {
            int[] temp = maxHeap.poll();
            res[i][0] = temp[0];
            res[i][1] = temp[1];
        }
        
        // Time Complexity: O(n log k)
        // Space Complexity: O(k)
        return res;
    }

    private int dist(int x, int y) {
        return x * x + y * y;
    }
}
