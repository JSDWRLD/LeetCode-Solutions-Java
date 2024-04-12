class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int middle = (start + end) / 2;

            if(nums[middle] == target){
                return middle;
            } else if (nums[middle] < target) {
                // go right
                start = middle + 1;
            } else {
                // go left
                end = middle - 1;
            }
        }

        // Time Complexity: O(log n)
        // Space Complexity: O(1)
        return -1;
    }
}
