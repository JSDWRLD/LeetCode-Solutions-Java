class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split("\\s");
        int index = 0;
        
        HashMap<Character, String> charMap = new HashMap<>();
        char[] charArray = pattern.toCharArray();
        
        if (words.length != charArray.length) return false;
        
        for (char c : charArray) {
            
            if (!charMap.containsKey(c) && !charMap.containsValue(words[index])) {
                charMap.put(c, words[index]);
            } else {
                if (charMap.containsKey(c)) {
                    if (!charMap.get(c).equals(words[index]) ) return false;
                } else {
                    return false;
                }
            }
            
            index++;
        }
      
        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return true;
    }
}
