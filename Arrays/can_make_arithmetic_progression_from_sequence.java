class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff = arr[1] - arr[0];

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] - arr[i-1] != diff) return false;
        }

        // Time Complexity: O(n log n)
        // Space Complexity: O(1)
        return true;
    }
}
