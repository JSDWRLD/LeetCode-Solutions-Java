class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();

        int i = 0;
        while (i < nums.length) {
            int j = nums[i] - 1;
            if (nums[i] != nums[j]) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            } else {
                i++;
            }
        }

        for (int check = 0; check < nums.length; check++) {
            if (nums[check] != check + 1) {
                result.add(check + 1);
            }
        }

        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return result; 
    }
}
