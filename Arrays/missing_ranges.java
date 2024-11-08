class Solution {
    public List<List<Integer>> findMissingRanges(int[] nums, int lower, int upper) {
        List<List<Integer>> res = new ArrayList<>();
        int prev = lower;

        for (int curr : nums) {
            if (curr > prev) {  // if there is a missing range between p and num-1
                res.add(List.of(prev, curr - 1));
            }
            prev = curr + 1;  // move pointer to the next number after num
        }
        
        if (prev <= upper) {  // if there are numbers missing after the last element in nums
            res.add(List.of(prev, upper));
        }

        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return res;
    }
}
