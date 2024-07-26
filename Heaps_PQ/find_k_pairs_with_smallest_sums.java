class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((p1, p2) -> (p1[0] + p1[1]) - (p2[0] + p2[1]));

        for (int i = 0; i < nums1.length && i < k; i++) {
            minHeap.add(new int[] {nums1[i], nums2[0], 0});
        }


        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < k && !minHeap.isEmpty(); i++) {
            int[] pair = minHeap.remove();
            res.add(List.of(pair[0], pair[1]));

            int index = pair[2] + 1;
            if (index < nums2.length) {
                minHeap.add(new int[] {pair[0], nums2[index], index});
            }
        }

        // Time Complexity: O(k * log k)
        // Space Complexity: O(k)
        return res;
    }
}
