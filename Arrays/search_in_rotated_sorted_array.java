class Solution {
    public int search(int[] nums, int target) {
        if(nums.length == 1 && nums[0] == target) return 0;
        if(nums.length == 1 && nums[0] != target) return -1;

        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
            int middle = (left + right)/2;
            if(nums[middle] == target) return middle;
            
            // left sorted portion or sorted array 
            if(nums[left] <= nums[middle]){
                if(nums[middle] < target || nums[left] > target) {
                    left = middle + 1;
                } else {
                    right = middle - 1;
                }
            } else {
                if(nums[middle] > target || target > nums[right]) {
                    right = middle - 1;
                } else {
                    left = middle + 1;
                }
            }
        }
        

        // Time Complexity: O(log n)
        // Space Complexity: O(1)
        return -1;
    }
}
