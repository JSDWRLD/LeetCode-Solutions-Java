class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        if (letters[0] > target || letters[n - 1] < target) return letters[0];

        int start = 0, end = n - 1;
        while (start <= end) {
            int mid = start + (end - start)/ 2;

            if (letters[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        // if it is the last letter we get n % n = 0
        // Time Complexity: O(log n)
        // Space Complexity: O(1)
        return letters[start % n];
    }
}
