class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int n : arr) {
            freq.put(n, freq.getOrDefault(n, 0)+1);
        }

        int max = -1;
        for (int key : freq.keySet()) {
            if (key == freq.get(key)) {
                max = Math.max(max, key);
            }
        }

        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return max;
    }
}
