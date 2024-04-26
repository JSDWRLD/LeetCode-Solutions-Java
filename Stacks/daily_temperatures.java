class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int[] res = new int[len];

        // Auxilary Stack which is in Monotonic Decreasing Order
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < len; i++){
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                // our stack contains indexes
                int index = stack.pop();
                res[index] = i - index;
            }

            stack.push(i);
        }

        // We could've done this in O(n^2) time but it is more efficient to use a stack and utilizie space.
        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return res;
    }
}
