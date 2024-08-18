class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        List<List<Integer>> res = new LinkedList<>();

        for (int i = 0; i < groupSizes.length; i++) {
            int key = groupSizes[i];
            List<Integer> curr = map.getOrDefault(key, new LinkedList<>());
            curr.add(i);
            map.put(key, curr);
            if (curr.size() == key) {
                res.add(new LinkedList<>(curr));
                curr.clear();
            } 
        }

        // Time Complexity: O(n)
        // Space Compleixty: O(n^2)
        return res;
    }
}
