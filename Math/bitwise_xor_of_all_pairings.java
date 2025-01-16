class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> freqMap = new HashMap<Integer, Integer>();
        int len1 = nums1.length, len2 = nums2.length;

        // each num in nums1 appears len2 times, vice versa for nums2
        for (int n : nums1) {
            freqMap.put(n, freqMap.getOrDefault(n, 0) + len2);
        }
        for (int n : nums2) {
            freqMap.put(n, freqMap.getOrDefault(n, 0) + len1);
        }

        // A number XOR itself is 0, so if the freq of a number is even
        // we dont need to add to result
        int result = 0;
        for (int key: freqMap.keySet()) {
            if (freqMap.get(key) % 2 != 0) {
                result ^= key;
            }
        }

        // Time Complexity: O(n + m)
        // Space Complexity: O(n + m)
        return result;
    }
}

// Brute force
// public int xorAllNums(int[] nums1, int[] nums2) {
//         List<Integer> pairs = new ArrayList<>();
        
//         for (int i = 0; i < nums1.length; i++) {
//             for (int j = 0; j < nums2.length; j++) {
//                 pairs.add(nums1[i] ^ nums2[j]);
//             }
//         }

//         int result = 0;
//         for (int num : pairs) {
//             result ^= num;
//         }

//         return result;
//     }
// }
