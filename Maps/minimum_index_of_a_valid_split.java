class Solution {
    public int minimumIndex(List<Integer> nums) {
        int n = nums.size();
        if (n == 1) return -1;

        int mostFreqNum = 0, maxFreq = 0;
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int curr = nums.get(i);
            int freq = freqMap.getOrDefault(curr, 0)+1;
            freqMap.put(curr, freq);
            if (freq > maxFreq) {
                mostFreqNum = curr;
                maxFreq = freq;
            }
        }

        int count = 0, target = maxFreq/2;
        for (int i = 0; i < n; i++) {
            if (nums.get(i) == mostFreqNum) count++;
            // If the freq*2 > first half length and second half length
            if ((count*2 > i + 1) && (2*(maxFreq-count) > n - i - 1))
                return i;
        }

        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return -1;
    }
}
