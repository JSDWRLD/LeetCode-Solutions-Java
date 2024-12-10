class Solution {
    public int maximumLength(String s) {

        // Pair will be special substring + len
        Map<Pair<Character, Integer>, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            int subLen = 0;
            char curr = s.charAt(i);

            for (int end = i; end < s.length(); end++) {
                if (s.charAt(end) == curr) {
                    subLen += 1;
                    Pair<Character, Integer> key = new Pair(curr, subLen);
                    map.put(key, map.getOrDefault(key, 0) + 1);
                } else {
                    break;
                }
            }
        }

        // Check our map for longest substring that has freq >= 3
        int result = 0;
        for (Pair p : map.keySet()) {
            int subLen = (int)p.getValue();
            if (map.get(p) >= 3 && subLen > result) result = subLen;
        }

        // Time Complexity: O(n^2)
        // Space Complexity: O(n^2)
        if (result == 0) return -1;
        else return result;
    }
}
