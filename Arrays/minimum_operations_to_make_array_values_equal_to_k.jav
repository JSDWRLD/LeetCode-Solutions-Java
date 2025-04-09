class Solution {
    public int minOperations(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int n: nums) {
            if (n < k) return -1;
            else if (n > k) set.add(n);
        }

        // We dont count k itself if it is min element
        // If k < min element, we have to add an operation
        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return set.size();
    }
}
