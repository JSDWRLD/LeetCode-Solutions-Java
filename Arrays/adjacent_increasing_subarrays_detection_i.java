class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        // track how many consecutive valid positions we've seen so far
        // k - 1 since we need that many consecutive steps
        int validCount = k - 1;
        if (validCount == 0) return true;

        for (int bIdx = k+1; bIdx < nums.size(); bIdx++) {
            int aIdx = bIdx - k;

            // Check that both increasing conditions hold
            if (nums.get(aIdx) > nums.get(aIdx-1) &&
                nums.get(bIdx) > nums.get(bIdx-1)
            ) {
                // Both parts continue increasing, one step closer
                // to forming two adjacent increasing subarrays
                validCount--; 
            } else {
                // one subarray broke condition reset 
                validCount = k - 1;
            }

            // strictly increasing subarrays of length k if == 0
            if (validCount == 0) {
                return true;
            }
        }

        // Time: O(n)
        // Space: O(1)
        return false;
    }
}

// k is the difference in pointer
// b = a + k, k = 3
// 0,1,2,3,4,5,6,7,8,9
// 2,5,7,8,9,2,3,4,3,1
// validSub =  0
// compare j and j-1
// compare j+k and j+k-1
// j = 4 , j+k = 7
