class Solution {
    public int[][] divideArray(int[] nums, int k) {
        // if we sort the arry, 
        // we can build a list of min diffs?
        // n/3 once hit then add to list

        Arrays.sort(nums);
        int[][] res = new int[nums.length/3][3];

        for (int i = 0; i < nums.length; i += 3) {
            if (nums[i+2] - nums[i] > k) return new int[0][0]; 

            res[i/3] = new int[]{nums[i], nums[i+1], nums[i+2]};
        }  

        // Time Complexity: O(n log n)
        // Space Complexity: O(log n), java quicksort
        return res;
    }
}
