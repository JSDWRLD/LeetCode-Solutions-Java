class Solution {
    public int maxVowels(String s, int k) {
        int max = 0, curr = 0, left = 0;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            while ((right - left + 1) > k) {
                char l = s.charAt(left);
                if (isVowel(l)) {
                    curr--;
                }

                left++;
            }

            if (isVowel(c)) {
                curr ++;
                max = Math.max(max, curr);
            }
        }

        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return max;
    }

    private boolean isVowel(char c) {
        if (c == 'a' ||
            c == 'e' ||
            c == 'i' ||
            c == 'o' ||
            c == 'u'
            ) {
                return true;
            }

        return false;
    }
}
