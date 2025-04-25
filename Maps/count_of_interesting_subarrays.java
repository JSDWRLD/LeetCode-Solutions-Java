class Solution {
    public long countInterestingSubarrays(List<Integer> nums, int modulo, int k) {
        
        long result = 0, matchingNums = 0;

        Map<Integer, Long> prefixMap = new HashMap<>();
        prefixMap.put(0, 1L);
        
        for (int num : nums) {
            if (num % modulo == k) matchingNums++;

            int currRemainder = (int)(matchingNums % modulo);
            int neededRemainder = (currRemainder - k + modulo) % modulo;

            result += prefixMap.getOrDefault(neededRemainder, 0L);
            prefixMap.put(currRemainder, prefixMap.getOrDefault(currRemainder, 0L)+1);
        }
        
        // M is modulo
        // Time Complexity: O(n)
        // Space Complexity: O(min(n, m))
        return result;
    }
}
