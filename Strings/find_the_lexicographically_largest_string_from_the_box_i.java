class Solution {
    public String answerString(String word, int numFriends) {
        int n = word.length();
        if (numFriends == 1) return word;

        // n - numFriends 4 - 2 + 1 = 3? len 3
        // 4 - 4 + 1, largest of len 1
        String max = "";
        int winSize = n - numFriends + 1;
        for (int i = 0; i < n; i++) {
            String temp;
            if (i+winSize <= n) {
                temp = word.substring(i, i+winSize);
            } else {
                temp = word.substring(i);
            }
            
            // N times
            if (temp.compareTo(max) > 0) {
                max = temp;
            }
        }

        // Time Complexity: O(n^2)
        // Space Complexity: O(n)
        return max;
    }
}
// split into numFriends chunks, start at end and inc up
// because that wil
