class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        int left = 0, right = n-1;

        // Removing trailing and leading spaces
        while (left <= right && s.charAt(left) == ' ') left++;
        while (left <= right && s.charAt(right) == ' ') right--;

        StringBuilder sb = new StringBuilder(); // Building words
        Stack<String> stack = new Stack<>(); // Maintain reverse order

        while (left <= right) {
            char current = s.charAt(left);
            
            // If we reach a space stop building and push to stack
            if (sb.length() != 0 && current == ' ') {
                stack.push(sb.toString());
                sb.setLength(0);
            } else if (current != ' ') {
                sb.append(current); // If a letter add to builder
            }
            
            left++;
        }

        // Push last word in, because no space at end
        stack.push(sb.toString());

        // Clear and build final result
        sb.setLength(0);
        while (!stack.isEmpty()) sb.append(stack.pop() + " ");

        // Return minus the last extra space
        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return sb.toString().substring(0, sb.length()-1);
    }
}
