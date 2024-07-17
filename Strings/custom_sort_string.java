class Solution {
    public String customSortString(String order, String s) {
        StringBuilder sb = new StringBuilder();
        
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c: s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        for (char c: order.toCharArray()) {
            if (map.containsKey(c)) {
                for (int i = 0; i < map.get(c); i++) {
                    sb.append(c);
                }
                map.remove(c);
            } 
        }
        
        if (map.isEmpty()) return sb.toString();
        
        for (char c: map.keySet()) {
            for (int i = 0; i < map.get(c); i++) {
                sb.append(c);
            }
        }

        // Time Complexity: O(n + m)
        // Space Complexity: O(n)
        return sb.toString();
    }
}
