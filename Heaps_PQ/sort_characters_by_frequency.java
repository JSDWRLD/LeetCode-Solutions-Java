class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c: s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Character> maxHeap = new PriorityQueue<>((c1, c2) -> map.get(c2) - map.get(c1));
        for (char key : map.keySet()) {
            maxHeap.add(key);
        }

        StringBuilder sb = new StringBuilder();

        while (!maxHeap.isEmpty()) {
            char c = maxHeap.poll();
            while (map.get(c) > 0) {
                map.put(c, map.get(c) - 1);
                sb.append(c);
            }
        }
        
        // Time Complexity: O(n log n)
        // Space Complexity: O(n)
        return sb.toString();
    }
}
