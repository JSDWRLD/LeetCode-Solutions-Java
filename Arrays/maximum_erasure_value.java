class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int max = 0; 
        int runningSum = 0, left = 0;
        HashSet<Integer> currNums = new HashSet<>();
        for (int right = 0; right < nums.length; right++) {
            
            while (currNums.contains(nums[right])) {
                runningSum -= nums[left];
                currNums.remove(nums[left]);
                left++;
            }

            runningSum += nums[right];
            currNums.add(nums[right]);
            max = Math.max(max, runningSum);
        }

        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return max;
    }
}
