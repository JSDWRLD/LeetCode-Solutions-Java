class Solution {
    public String robotWithString(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) freq[c - 'a']++;

        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        char minChar = 'a';

        // n for length s
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            freq[curr - 'a']--;
            stack.push(curr);

            // Go until find the next minChar in s
            // max 26 iteration
            while (minChar != 'z' && freq[minChar - 'a'] == 0) {
                minChar++;
            }
            
            // n iterations max 
            // While the top of the stack is <= min char we can append
            while (!stack.isEmpty() && stack.peek() <= minChar) {
                sb.append(stack.pop());
            }
        }

        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return sb.toString();
    }
}
