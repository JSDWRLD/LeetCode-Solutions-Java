class Solution {
    public int totalFruit(int[] fruits) {
        int winStart = 0, max = 0;
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int winEnd = 0; winEnd < fruits.length; winEnd++) {
            freqMap.put(fruits[winEnd], freqMap.getOrDefault(fruits[winEnd], 0) + 1);

            // moving window size if freqMap is greater than 2 fruits
            while (freqMap.size() > 2) {
                freqMap.put(fruits[winStart], freqMap.get(fruits[winStart]) - 1);
                if (freqMap.get(fruits[winStart]) <= 0) freqMap.remove(fruits[winStart]);

                winStart++;
            }

            // calculate max window length and update
            max = Math.max(max, winEnd - winStart + 1);
        }

        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return max;
    }
}
