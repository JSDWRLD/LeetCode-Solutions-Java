class Solution {
    public String reverseVowels(String s) {
        
        int left = 0, right = s.length()-1;
        char[] sChars = s.toCharArray();
        while (left < right) {
            while (left < s.length() && !isVowel(sChars[left])) {
                left += 1;
            }

            while (right > 0 && !isVowel(sChars[right])) {
                right -= 1;
            }

            if (left < right) {
                char temp = sChars[left];
                sChars[left] = sChars[right];
                sChars[right] = temp;
                left += 1;
                right -= 1;
            }
        }

        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return new String(sChars);
    }

    private boolean isVowel(char c) {
        return  c == 'a' ||  c =='e' ||  c == 'i' ||  c == 'o' ||  c == 'u' ||
                c == 'A' || c== 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
