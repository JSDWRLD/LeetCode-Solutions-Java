class Solution {
    public int minimumOperations(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for (int i = nums.length-1; i >= 0; i--) {
            if (set.contains(nums[i])) {
                return i/3 + 1;
            }
            set.add(nums[i]);
        }

        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return 0;
    }
}
