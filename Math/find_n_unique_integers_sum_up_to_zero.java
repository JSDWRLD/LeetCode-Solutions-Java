class Solution {
    public int[] sumZero(int n) {
        int[] result = new int[n];
        
        for (int i = 0; i < n-1; i += 2) {
            int num = i+1;
            result[i] = num;
            result[i+1] = -1 * num;
        }
        
        if (n % 2 != 0) result[n-1] = 0; // Append 0 if n is odd

        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return result;
    }
}
