class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];

        int j = 0;
        for (int i = 0; i < 2*n; i++) {
            if (i % 2 == 0) {
                ans[i] = nums[j];
            }
            else {
                ans[i] = nums[j+n];
                j++;
            }
        }
        
        // Time: O(n)
        // Space: O(n)
        return ans;
    }
}

// even use from first half
// odd use from second half
// 2,5,1,3,4,7
// i = 2
// 2, 3,
// j = 1
