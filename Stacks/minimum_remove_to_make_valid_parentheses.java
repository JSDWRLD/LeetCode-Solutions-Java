class Solution {
    public String minRemoveToMakeValid(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        HashSet<Integer> removeIndex = new HashSet<>();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(i);
            } else if (!stack.isEmpty() && c == ')' ) {
                stack.pop();
            } else if (stack.isEmpty() && c == ')') {
                removeIndex.add(i);
            } 
        }

        while (!stack.isEmpty()) removeIndex.add(stack.pop());

        for (int i = 0; i < n; i++) {
            if (!removeIndex.contains(i)) 
                sb.append(s.charAt(i));
        }

        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return sb.toString();
    }
}

// Input: String with parens and lower case chars
// Remove Minimum Number of Parens
