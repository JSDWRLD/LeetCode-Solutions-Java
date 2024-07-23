class Solution {
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character, Integer> mp = new HashMap<>();
        for (char t : tasks) mp.put(t, mp.getOrDefault(t, 0) + 1);

        PriorityQueue<Character> maxHeap = new PriorityQueue<>((c1, c2) -> mp.get(c2) - mp.get(c1));

        for (char c : mp.keySet()) maxHeap.add(c);

        int counter = 0;
        while (!maxHeap.isEmpty()) {
            List<Character> waiting = new ArrayList<>();
            int j = n + 1;

            for (; j > 0 && !maxHeap.isEmpty(); j--) {
                counter++;

                char temp = maxHeap.poll();
                if (mp.get(temp) > 1) {
                    mp.put(temp, mp.get(temp) - 1);
                    waiting.add(temp);
                }
            }

            maxHeap.addAll(waiting);
            if (!maxHeap.isEmpty()) {
                counter += j;
            }
        }

        // While loop is n and poll is log n
        // Time Complexity: O(n log n)
        // Space Compleixty: O(n), hashmap
        return counter;
    }
}
