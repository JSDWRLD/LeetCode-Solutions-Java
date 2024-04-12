class Solution {
    public int fib(int n) {
        HashMap<Integer, Integer> memo = new HashMap<>();
        return fib(n, memo);
    }

    public int fib(int n, HashMap<Integer, Integer> memo){
        if(memo.containsKey(n)) return memo.get(n);
        if(n == 0) return 0;
        if(n <= 2) return 1;

        int value = fib(n - 1, memo) + fib(n - 2, memo);
        memo.put(n, value);

        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return value;
    }
}
