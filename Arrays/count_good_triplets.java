class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int n = arr.length;

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    if (Math.abs(arr[i] - arr[j]) <= a &&
                        Math.abs(arr[j] - arr[k]) <= b &&
                        Math.abs(arr[i] - arr[k]) <= c
                    ) {
                        count++;
                    }
                }
            }
        }

        // Time Complexity: O(n^3)
        // Space Complexity: O(1)
        return count;
    }

    // good triplets satisfy
    // i - j <= a
    // j - k <= b
    // i - k <= c

    // input arr max len 100
    // value of nums 0-1000
    
}
