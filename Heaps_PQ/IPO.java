class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        // Creating PriorityQueue that sorts based on values at INDEX, NOT INDEXES
        PriorityQueue<Integer> minCap = new PriorityQueue<>((a, b) -> capital[a] - capital[b]);
        PriorityQueue<Integer> maxProf = new PriorityQueue<>((a, b) -> profits[b] - profits[a]);
        for (int i = 0; i < capital.length; i++) {
            // Adds in the index but the priority queue sorts based on Value AT INDEX
            minCap.offer(i); 
        }

        for (int i = 0; i < k; i++) {
            while (!minCap.isEmpty() && capital[minCap.peek()] <= w) {
                // Puts the index of the lowest capital under our budget
                maxProf.offer(minCap.poll());
            }

            if (maxProf.isEmpty()) break;

            // Keep removing from max profit that fits budget until we hit K projects
            w += profits[maxProf.poll()];
        }


        // Time Complexity: O(n log n)
        // Space Complexity: O(n)
        return w;
    }
}
