// There are faster solutions which utilize recursion that I will learn and implement later on, as for now this is the easiest to understand solution.
class Solution {
    public int minimumOperationsToMakeEqual(int x, int y) {
        if (x == y) return 0;
        
        HashMap<Integer, Integer> seen = new HashMap<>();
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {x, 0}); // Add node val of x and 0 steps

        // Traverse our graph in a BFS manner, decision tree
        while (!queue.isEmpty()) {
            int[] node = queue.poll();
            int val = node[0];
            int steps = node[1];

            if (val == y) return steps;

            List<Integer> possibleVals = new LinkedList<>();
            possibleVals.add(val+1);
            possibleVals.add(val-1);
            if (val % 5 == 0) possibleVals.add(val/5);
            if (val % 11 == 0) possibleVals.add(val/11);

            for (int nextVal : possibleVals) {
                // If we already seen our node do not enqueue
                if (!seen.containsKey(nextVal)) {
                    seen.put(nextVal, steps+1);
                    queue.offer(new int[] {nextVal, steps+1});
                }
            }
        }

        return -1;
    }
}
