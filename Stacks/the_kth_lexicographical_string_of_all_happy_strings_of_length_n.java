class Solution {
    public String getHappyString(int n, int k) {
        Stack<String> stack = new Stack<>();
        int count = 0;

        stack.push("");
        while (!stack.isEmpty()) {
            String curr = stack.pop();
            int len = curr.length();

            if (len == n) {
                count += 1;
                if (count == k) return curr;
                continue;
            }

            for (char currChar = 'c'; currChar >= 'a'; currChar--) {
                if (len == 0 || curr.charAt(len-1) != currChar) {
                    stack.push(curr + currChar);
                }
            }
        }

        // Time Complexity: (n * 2^n)
        // Space Complexity: O(n^2)
        return "";
    }
}
