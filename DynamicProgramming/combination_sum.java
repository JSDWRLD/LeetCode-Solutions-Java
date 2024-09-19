class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        backtrack(candidates, target, 0, res, curr);

        // Time Complexity: O(2^t)
        // Space Complexity: O(2^t)
        return res;
    }

    private void backtrack(int[] candidates, int target, int i, List<List<Integer>> res, List<Integer> curr) {

        if (target == 0) {
            // Copy current combination, we can't place curr inside cause it gets changed as we make decisions
            res.add(new ArrayList<>(curr));
            return;
        } else if (target < 0 || i >= candidates.length) {
            return;
        } else {
            // 1st Decision, can keep using index to add
            curr.add(candidates[i]);
            backtrack(candidates, target - candidates[i], i, res, curr);

            // 2nd Decision, increment index, no more using old index
            curr.remove(curr.get(curr.size() - 1));
            backtrack(candidates, target, i+1, res, curr);
        }
    }
}
