class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int mod = 1_000_000_007;

        // precompute to not have int overflow
        int[] pow_2 = new int[nums.length];
        pow_2[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            pow_2[i] = (pow_2[i-1] * 2) % mod;
        }

        int left = 0, right = nums.length-1, res = 0;
        while (left <= right) {
            if (nums[left]+nums[right] <= target) {
                // count all valid substrings
                res += pow_2[right-left];
                res %= mod;
                // inc up to check next possible min for substring
                left++;
            } else {
                // find new max bound
                right--;
            }
        }

        // Time Complexity: O(n log n)
        // Space Complexity: O(n)
        return res;
    }
}

// num of non empty subsequences min and max sum <= t
// meaning, all numbers in the middle are valid of the two largest digits
// can be 0 nums
// 2^len
