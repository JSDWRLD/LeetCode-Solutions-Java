class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] range = new int[nums.length];

        int i = 0;
        int[] result = new int[2];
        for (int n : nums) {
            range[n]++;
            if (range[n] == 2) {
                result[i++] = n;
                if (i == 2) break;
            }
        }

        // Time: O(n)
        // Space: O(n)
        return result;
    }
}
