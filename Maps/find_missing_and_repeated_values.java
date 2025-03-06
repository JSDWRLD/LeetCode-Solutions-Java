class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                freqMap.put(grid[i][j], freqMap.getOrDefault(grid[i][j], 0) + 1);
            }
        }

        int[] ans = new int[2];
        int prev = 0;
        for (int key : freqMap.keySet()) {
            int freq = freqMap.get(key);
            if (freq == 2) {
                ans[0] = key;
            } 
            if (prev + 1 != key) {
                ans[1] = prev+1;
            }
            prev = key;
        }

        // Time Complexity: O(n^2)
        // Space Complexity: O(n^2)
        if (ans[1] == 0) ans[1] = n*n;
        return ans;
    }
}
