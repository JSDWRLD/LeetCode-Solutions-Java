class Solution {
    // Define our pointers on the arrays
    private int p1 = 0, p2 = 0;

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length, total = m+n;

        double answer;
        // If median is different based on total length
        if (total % 2 != 0) {
            for (int i = 0; i < total/2; i++) {
                int temp = findMin(nums1, nums2);
            }

            answer = findMin(nums1, nums2);
        } else {
            for (int i = 0; i < total/2-1; i++) {
                int temp = findMin(nums1, nums2);
            }

            // Combine the two middle numbers and then add
            answer = (double)(findMin(nums1, nums2) + findMin(nums1, nums2)) / 2.0; 
        }

        // Since we only iterate up to m + n / 2
        // Time Complexity: O(log(m + n))
        // Space Complexity: O(1)
        return answer;
    }

    // This will increment our pointers up to m+n/2 length, leaving us at our middle point
    private int findMin(int[] nums1, int[] nums2) {
        
        // If both pointers are in range then the return min of both and increment
        if (p1 < nums1.length && p2 < nums2.length) {
            if (nums1[p1] < nums2[p2]) {
                return nums1[p1++];
            } else {
                return nums2[p2++];
            }
        } else if (p1 < nums1.length) {
            // Return whats left of p1 because p2 out of bounds
            return nums1[p1++];
        } else if (p2 < nums2.length) {
            // Return whats left of p2 because p1 out of bounds
            return nums2[p2++];
        }

        return -1;
    }
}
