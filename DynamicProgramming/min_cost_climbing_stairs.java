class Solution {
        HashMap<Integer, Integer> memo = new HashMap<>();
    public int minCostClimbingStairs(int[] cost) {

        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return climb(cost, cost.length);
    }

    private int climb(int[] cost, int i) {
        if (i <= 1) return 0;
        if (memo.containsKey(i)) return memo.get(i);

        int stepDownOne = cost[i-1] + climb(cost, i-1);
        int stepDownTwo = cost[i-2] + climb(cost, i-2);
        memo.put(i, Math.min(stepDownOne, stepDownTwo));

        return memo.get(i);
    }
}
