class Solution {
    public String findDifferentBinaryString(String[] nums) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            char curr = nums[i].charAt(i);
            sb.append(curr == '0' ? '1' : '0');
        }

        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return sb.toString();
    }
}
