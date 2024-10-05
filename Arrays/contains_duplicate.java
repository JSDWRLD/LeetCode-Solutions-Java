class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int n : nums) {
            if (set.contains(n)) return true;
            set.add(n);
        }

        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return false;
    }
}
