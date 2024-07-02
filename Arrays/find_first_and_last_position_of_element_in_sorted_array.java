class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[] {-1, -1};
        if (nums.length == 0) return res;
        res[0] = bst(nums, target, false);
        // if not found first index, then we dont need to find end
        if(res[0] != -1) res[1] = bst(nums, target, true);

        // Time Complexity: O(log n)
        //  Space Complexity: O(1)
        return res;
    }
    
    private int bst(int[] nums, int key, boolean findMax) {
        int keyIndex = -1;

        int start = 0, end = nums.length - 1;

        while (start <= end) {
            int middle = start + (end - start) / 2;

            if (nums[middle] < key) {
                start = middle + 1;
            } else if (nums[middle] > key) {
                end = middle - 1;
            } else {
                keyIndex = middle;
                // found we continue until we find lowest
                if (findMax) {
                    start = middle + 1;
                } else {
                    end = middle - 1;
                }
            }
        }

        // Time Complexity: O(log n)
        //  Space Complexity: O(1)
        return keyIndex;
    }
}
