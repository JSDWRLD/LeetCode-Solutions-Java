class Solution {
    public int findDuplicate(int[] nums) {
        // We use slow and fast pointer because this problem
        // represents a cyclic array because range is (1, n)
        
        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        // after a cycle has found find the entry point
        int res = nums[0];
        while (slow != res) {
            slow = nums[slow];
            res = nums[res];
        } while (slow != res);


        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return res;
    }
}
