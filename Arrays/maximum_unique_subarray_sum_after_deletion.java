class Solution {
    public int maxSum(int[] nums) {
        List<Integer> unq = getUnique(nums);

        int running = unq.get(0), max = unq.get(0);
        for (int i = 1; i < unq.size(); i++) {
            int curr = unq.get(i);
            running = Math.max(running + curr, curr);
            max = Math.max(running, max);
        }

        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return max;
    }
    
    private List<Integer> getUnique(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> res = new ArrayList<>();
        List<Integer> original = new ArrayList<>();

        for (int n : arr) {
            if (!set.contains(n) && n > 0) {
                set.add(n);
                res.add(n);
            }
            original.add(n);
        }

        return res.size() == 0 ? original : res;
    }
}
