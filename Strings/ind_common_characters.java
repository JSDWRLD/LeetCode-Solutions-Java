class Solution {
    public List<String> commonChars(String[] words) {
        int[] globalFreq = new int[26];
        Arrays.fill(globalFreq, Integer.MAX_VALUE);
        
        for (String word : words) {
            int[] charFreq = new int[26];
            
            for (char c: word.toCharArray()) {
                charFreq[c - 'a']++;
            }
            
            for (int i = 0; i < 26; i++) {
                // Min will be 0 if it doesn't exist in one of the arrays
                globalFreq[i] = Math.min(globalFreq[i], charFreq[i]);
            }
        }
        
        List<String> result = new ArrayList<>();
        
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < globalFreq[i]; j++) {
                // if freq is more than 0 we add
                result.add(Character.toString((char) (i + 'a')));
            }
        }
        
        // Time Complexity: O(N * M)
        // Space Complexity: O(26)
        return result;
    }
}
