class Solution {
    public String reorganizeString(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Character> maxHeap = new PriorityQueue<>((c1, c2) -> map.get(c2) - map.get(c1));
        for (char key : map.keySet()) {
            maxHeap.offer(key);
        }

        char prev = 0;
        StringBuilder sb = new StringBuilder(s.length());
        while (!maxHeap.isEmpty()) {

            char temp = maxHeap.poll();

            if (prev != 0 && map.get(prev) > 0) {
                maxHeap.offer(prev);
            }

            sb.append(temp);
            map.put(temp, map.get(temp) - 1);
            prev = temp;
        }


        // Time Complexity: O(n log n)
        // Space Complexity: O(n)
        if (sb.length() == s.length()) return sb.toString();
        else return "";
    }
}
