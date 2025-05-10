class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        
        long n2Sum = 0;
        int countZeroN2 = 0;
        for (int n : nums2) {
            if (n == 0) {
                countZeroN2++;
                n2Sum++;
            }
            n2Sum += n;
        }

        long n1Sum = 0;
        int countZeroN1 = 0;
        for (int n : nums1) {
            if (n == 0) {
                countZeroN1++;
                n1Sum++;
            }
            n1Sum += n;
        }

        // If one has the larger sum but the other one doesn't have a zero
        if ((n2Sum > n1Sum && countZeroN1 == 0) ||
            (n1Sum > n2Sum && countZeroN2 == 0)) 
            return -1;

        // Return the maximum of these because we add 1 at each step
        // its already the minimum
        // Time Complexity: O(n + m)
        // Space Complexity: O(1)
        return Math.max(n1Sum, n2Sum);
    }
}

// replace all 0s in both arrays with pos ints
// the sum of elements in both arrays = same
// take diff of numbers , count zeros?
// 3,2,0,1,0 = 6 0 : 2 no limit here
// 6,5,1, 1, 1= 11,  0 : 1
// diff = 5, add 1 to 2, then add 2, 4 to arr 1

// Greddy?
// each zero in nums2 turn to 1, get sum
// nums1 we count zero and sum, then take diff
// evenly distribute the diff amongst zeros
// if no zeros return -1
