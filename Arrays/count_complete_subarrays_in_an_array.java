class Solution {
    public int countCompleteSubarrays(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);

        int distinct = set.size();
        HashMap<Integer, Integer> subFreqMap = new HashMap<>();


        int right = 0, total = 0;
        for (int left = 0; left < nums.length; left++) {
            // Each time we shift window left, deduct from the freqMap
            // deduct previous because it is no longer in our window
            if (left > 0) {
                int num = nums[left-1]; 
                subFreqMap.put(num, subFreqMap.get(num) - 1);

                if (subFreqMap.get(num) <= 0) {
                    subFreqMap.remove(num);
                }
            }

            // Expand the window and add the freq map
            // if their are the same number of distinct elements break
            while (right < nums.length && subFreqMap.size() < distinct) {
                int num = nums[right]; 
                subFreqMap.put(num, subFreqMap.getOrDefault(num, 0) + 1);
                right++;
            }

            // All the subarrays after where our right pointer is is valid
            if (subFreqMap.size() == distinct) {
                // add 1 to consider this current correct subarray
                total += (nums.length - right) + 1;
            }
        }

        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return total;
    }
}
