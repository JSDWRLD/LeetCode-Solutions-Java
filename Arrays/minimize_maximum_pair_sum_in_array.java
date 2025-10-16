class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        
        int max = 0;
        int left = 0, right = nums.length-1;
        while (left < right) {
            int curr = nums[left] + nums[right];
            max = Math.max(curr, max);
            left++;
            right--;
        }
        
        // Time: O(n log n)
        // Space: O(log n) depending on sorting implemntation
        return max;
    }
}

// 1, 3, 4, 4, 5, 6
// 
