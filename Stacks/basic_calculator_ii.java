class Solution {
    public int calculate(String s) {
       
        Stack<Integer> stack = new Stack<>();
        char lastOperator = '+'; // Start at +
        int currNum = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                currNum = (currNum * 10) + (c - '0');
            } 
            if (!Character.isDigit(c) && c != ' ' || i == s.length()-1) {
                // Process our currNum based on previous operator
                switch (lastOperator) {
                    // If + or - we save our current num for later
                    case '+':
                        stack.push(currNum);
                        break;
                    case '-':
                        stack.push(currNum * -1);
                        break;

                    // If * or / we multiple or divide whatever on left with right side
                    case '*':
                        stack.push(stack.pop()*currNum);
                        break;
                    case '/':
                        stack.push(stack.pop()/currNum);
                        break;
                }

                // Update our lastOperator to curr
                lastOperator = c;
                currNum = 0;
            }
        }

        int result = 0;
        while (!stack.isEmpty()) result += stack.pop();

        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return result;
    }
}
