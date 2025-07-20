class Solution {
    private List<List<Integer>> combos;
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        combos = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates, target, 0, 0, new ArrayList<Integer>());

        // Time Complexity: O(2^n)
        // Space Complexity: O(n)
        return combos;
    }

    public void backtrack(int[] candidates, int target, int sum, int start, ArrayList<Integer> path) {
        if (sum > target) return;

        if (sum == target) {
            combos.add(new ArrayList<>(path)); // Add a copy of the current combination
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            int curr = candidates[i];
            if (i > start && curr == candidates[i - 1]) continue;

            path.add(curr);
            backtrack(candidates, target, sum+curr, i+1, path);
            path.remove(path.size()-1);
        }
    }
}
