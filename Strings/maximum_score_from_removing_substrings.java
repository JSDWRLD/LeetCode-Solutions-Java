class Solution {
    public int maximumGain(String s, int x, int y) {
        int totalScore = 0;
        String highPriority = x > y ? "ab" : "ba";
        String lowPriority = highPriority.equals("ab") ? "ba" : "ab";

        String afterPassOne = prioritizePair(s, highPriority);
        int removed = (s.length() - afterPassOne.length()) / 2;
        totalScore += removed * Math.max(x,y);

        // Remove remaining from the leftover string
        String afterPassTwo = prioritizePair(afterPassOne, lowPriority);
        removed = (afterPassOne.length()-afterPassTwo.length())/2;
        totalScore += removed * Math.min(x,y);

        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return totalScore;
    }

    private String prioritizePair(String s, String pair) {

        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == pair.charAt(0) && c ==  pair.charAt(1)) {
                stack.pop();
            } 
            else {
                stack.push(c);
            }
        }

        StringBuilder remainingChars = new StringBuilder();
        while (!stack.isEmpty()) {
            remainingChars.append(stack.pop());
        }

        return remainingChars.reverse().toString();
    }
}
