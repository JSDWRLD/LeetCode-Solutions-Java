class Solution {
    public int climbStairs(int n) {
        // Create memo for remember sub results already calculated
        HashMap<Integer, Integer> memo = new HashMap<>();
        return climbStairs(n, memo);
    }

    public int climbStairs(int n, HashMap<Integer, Integer> memo){
        // if our memo already calculated result then we simply return
        if(memo.containsKey(n)) return memo.get(n);
        // base case for our recursion
        if(n == 1 || n == 0) return 1;
        
        // get the value 
        int value = climbStairs(n -1, memo) + climbStairs(n-2, memo);
        memo.put(n, value);

        // Normally if we didn't memoize, we would've had a time complexity of O(2^n)
        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return value;
    }
    
}
