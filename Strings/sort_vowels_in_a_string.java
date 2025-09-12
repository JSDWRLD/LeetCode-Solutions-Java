class Solution {
    public String sortVowels(String s) {

        // note all vowel slots
        // take all vowels out into a char arr, sort, then
        // place in order in vowel slots

        List<Character> vowels = new ArrayList<>();

        char[] sArr =  s.toCharArray();
        for (int i = 0; i < sArr.length; i++) {
            char c = sArr[i];
            if (isVowel(c)) {
                vowels.add(c);
                sArr[i] = '1'; // sentinel value
            }
        }

        Collections.sort(vowels);
        int k =  vowels.size();
        int j = 0; 
        for (int i = 0; i < sArr.length; i++) { 
            char c = sArr[i];
            if (c == '1' && j < k) {
                sArr[i] = vowels.get(j);
                j++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char c : sArr) sb.append(c);

        // Time Complexity: O(n log n)
        // Space Complexity: O(n) 
        return sb.toString();
    }
    
    private boolean isVowel(char curr) {
        char c = Character.toLowerCase(curr);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
