class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int[][] mapping = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            mapping[i][0] = nums[i];
            mapping[i][1] = i;
        }

        // Sort vals in descending order
        Arrays.sort(mapping, (a, b) -> Integer.compare(b[0], a[0]));
        // Sort the first k in asc index order
        Arrays.sort(mapping, 0, k, (a, b) -> Integer.compare(a[1], b[1]));
        
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = mapping[i][0];
        }

        // Time Complexity: O(n log n)
        // Space Complexity: O(n)
        return res;
    }
}
