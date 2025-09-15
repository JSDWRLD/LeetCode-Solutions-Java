class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        HashSet<Character> set = new HashSet<>();
        for (char c : brokenLetters.toCharArray()) set.add(c);

        int res = 0;
        String[] arr = text.split(" ");
        for (String word : arr) {
            if (!hasBroken(word, set)) {
                res++;
            }
        }
        
        // N = Total Chars
        // B = len of brokenLetters
        // Time Complexity: O(N + B)
        // Space Complexity: O(N + B)
        return res;
    }

    private boolean hasBroken(String word, HashSet<Character> set) {
        for (char c : word.toCharArray()) {
            if (set.contains(c)) return true;
        }

        return false;
    }
}
