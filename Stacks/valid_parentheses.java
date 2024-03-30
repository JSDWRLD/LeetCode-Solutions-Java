class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            } else {
                if(stack.isEmpty()) return false;

                char check = stack.pop();
                if(c == ')' && check != '(' || c == '}' && check != '{' 
                || c == ']' && check != '[') return false;

            }
        }

        // check if there is a continous add and never enters else block
        // example: [[, this never enters the else block therefore we return false 
        // cause nothing is popped.
        return stack.isEmpty();

        // Time Complexity: O(n)
        // Space Complexity: O(1)
    }
}