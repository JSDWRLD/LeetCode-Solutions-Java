class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer, Integer> m = new HashMap<>();
        for (int n : arr) {
            m.put(n, m.getOrDefault(n, 0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(m.values());
        while (k > 0) {
            k -= pq.poll();
        }

        // Time Complexity: O(n + k log n)
        // Space Complexity: O(n)
        if (k == 0) return pq.size();
        else return pq.size() + 1;
    }
}
