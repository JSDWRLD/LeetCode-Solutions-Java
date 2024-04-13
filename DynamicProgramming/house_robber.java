class Solution { 
    public int rob(int[] nums) {
        // creating memo
        HashMap<Integer, Integer> memo = new HashMap<>();
        return rob(nums, nums.length - 1, memo);
    }

    public int rob(int[] nums, int i, HashMap<Integer, Integer> memo){
        // end index we make a decision
        if(i < 0) return 0;
        // if our memo already has seen subproblem index return value
        if(memo.containsKey(i)) return memo.get(i);

        // we get the max of our two decisions
        // a. we get robbery of current house and loot of house before prev
        // b. loot from prev house and anything before that
        int result = Math.max(rob(nums, i - 2, memo) + nums[i], rob(nums, i -1, memo));
        memo.put(i, result);

        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return result;
    }
}
