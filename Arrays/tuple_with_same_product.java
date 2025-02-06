class Solution {
    public int tupleSameProduct(int[] nums) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        // O(n*n-1) -> O(n^2)
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                // makes sure we have 2 distinct nums
                int product = nums[i] * nums[j];
                freqMap.put(product, freqMap.getOrDefault(product, 0) + 1);
            }
        }

        int totalTuples = 0;
        for (int freq : freqMap.values()) {
            if (freq >= 2) 
                totalTuples += freq * (freq-1) * 4;
        }

        // Time Complexity: O(n^2)
        // Space Complexity: O(p) -> Possible products
        return totalTuples;
    }
}
