class Solution {
    public boolean doesAliceWin(String s) {
        // alice wins in all cases, except when no vowels
        boolean hasVowel = false;
        for (char c : s.toCharArray()) {
            if (c == 'a' || c =='e' || c == 'i' || c == 'o' || c =='u') {
                hasVowel = true;
                break;
            }
        }

        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return hasVowel;
    }
        // 0 vowels counts
        // alice = odd vowels
        // bob = even vowels
        // if vowels num == odd alice auto win
        // if vowels numm == even alice
        // delete odd substring
        // 4 - 3 = 1 
        // odd - even = odd
        // alice wins
        // then deletes another odd substring
}
