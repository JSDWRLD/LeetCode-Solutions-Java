class Solution {
    public boolean isValid(String word) {
        if (word.length() < 3) {
            return false;
        }

        boolean foundVowel = false, foundConsonant = false;
        for (char c : word.toLowerCase().toCharArray()) {
            if (!Character.isLetterOrDigit(c)) return false;
            if (isVowel(c)) foundVowel = true;
            else if (!Character.isDigit(c)) foundConsonant = true;
        }

        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return foundVowel && foundConsonant;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c =='u';
    }
}
