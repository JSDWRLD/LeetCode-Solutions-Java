class Solution {
    public int shortestDistance(String[] wordsDict, String word1, String word2) {
        int min = Integer.MAX_VALUE;

        int first = -1, second = -1;
        for (int i = 0; i < wordsDict.length; i++) {
            String curr = wordsDict[i];
            if (curr.equals(word1)) first = i;
            else if (curr.equals(word2)) second = i;

            if (first != -1 && second != -1) min = Math.min(min, Math.abs(first-second));
        }

        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return min;
    }
}
