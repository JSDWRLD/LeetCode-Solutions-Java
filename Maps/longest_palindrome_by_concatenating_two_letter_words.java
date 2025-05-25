class Solution {
    public int longestPalindrome(String[] words) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) map.put(word, map.getOrDefault(word, 0) + 1);
        
        int len = 0;
        boolean usedMid = false;
        for (String word : map.keySet()) {
            char first = word.charAt(0);
            char second = word.charAt(1);
            String opposite = "" + second + first;

            int freq = map.get(word);
            if (first == second) {
                if (freq % 2 == 0) len += freq;
                else {
                    usedMid = true;
                    len += freq - 1;
                }
            }
            // Use < because  l > c so this combo lc & cl is not used twice
            else if (first < second && map.containsKey(opposite)) {
                len += 2 * Math.min(freq, map.get(opposite));
            }
        }

        if (usedMid) len += 1;
        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return 2 * len;
    }
}
