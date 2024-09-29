class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> magFreq = new HashMap<>();
        for (char c : magazine.toCharArray()) {
            magFreq.put(c, magFreq.getOrDefault(c, 0) + 1);
        }

        for (char c : ransomNote.toCharArray()) {
            if (magFreq.containsKey(c)) {
                magFreq.put(c, magFreq.get(c) - 1);
                if (magFreq.get(c) == 0) {
                    magFreq.remove(c);
                }
            } else {
                return false;
            }
        }
        
        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return true;
    }
}
