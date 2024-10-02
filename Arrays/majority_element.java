class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);

        int freq = nums.length/2, count = 1, prev = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == prev) {
                prev = nums[i];
                count += 1;
                if (count > freq) return nums[i];
            } else {
                prev = nums[i];
                count = 1;
            }
        }

        // We can use a map for O(n) time and O(n) space

        // Time Complexity: O(n log n)
        // Space Complexity: O(1)
        return nums[0];
    }
}
