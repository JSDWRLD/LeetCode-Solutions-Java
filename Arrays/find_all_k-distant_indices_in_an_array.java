class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        int n = nums.length;
        int[] ranges = new int[n+1];
        for (int i = 0; i < n; i++) {
            if (nums[i] == key) {
                int start = Math.max(0, i - k);
                int end = Math.min(n, i + k + 1);
                ranges[start]++; // Mark start of the valid range
                if (end < n) ranges[end]--; // Mark end of a valid range
            }
        }

        List<Integer> res = new ArrayList<>();
        int counter = 0;
        for (int i = 0; i < n; i++) {
            counter += ranges[i];
            // If we are within a valid range
            // add index
            if (counter > 0) res.add(i);
        }

        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return res;
    }
}

// class Solution {

//     public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
//         List<Integer> res = new ArrayList<>();
//         int n = nums.length;
        
//         for (int i = 0; i < n; ++i) {
//             for (int j = 0; j < n; ++j) {
//                 if (nums[j] == key && Math.abs(i - j) <= k) {
//                     res.add(i);
//                     break; 
//                 }
//             }
//         }

//         // Time Complexity: O(n^2)
//         // Space Complexity: O(1)
//         return res;
//     }
// }

// // 0, 1, 2, 3, 4, 5, 6
// // 3, 4, 9, 1, 3, 9, 5
// // start: 1 end: 4
// // start 4  end 6
// // 0, 1, 0, -1, 1, 0, -1
