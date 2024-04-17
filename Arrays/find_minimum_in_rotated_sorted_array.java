class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length -1;
        int min = Integer.MAX_VALUE;

        // Binary Search
        while(left <= right) {
            int middle = (right + left)/ 2;
            min = Math.min(min, nums[middle]);

            // if the array is already sorted then we just return left most node.
            if(nums[left] < nums[right]) {
                min = Math.min(min, nums[left]);
                break;
            }

            if(nums[left] <= nums[middle]){
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        // Time Complexity: O(log n)
        // Space Complexity: O(1)
        return min;
    }
}
