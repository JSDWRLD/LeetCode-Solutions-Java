class Solution {
    public boolean canBeValid(String s, String locked) {
        int n = s.length();
        if (n % 2 != 0) return false;

        int open = 0, unlocked = 0;
        for (int i = 0; i < n; i++) {
            if (locked.charAt(i) == '0') unlocked += 1;
            else if (s.charAt(i) == '(') open += 1;
            else if (s.charAt(i) == ')') {
                if (open > 0) open -= 1;
                else if (unlocked > 0) unlocked -= 1;
                else return false;
            }
        }

        int balanced = 0;
        for (int i = n-1; i >= 0; i--) {
            // tilt balance because we have a unlocked paren
            if (locked.charAt(i) == '0') {
                unlocked -= 1;
                balanced -= 1;
            } else if (s.charAt(i) == '(') {
                // subtract from open and add to balance
                open -= 1;
                balanced += 1;
            } else if (s.charAt(i) == ')') {
                // tilt balance because we have closed
                balanced--;
            }

            // only balanced if both = 0;
            if (open == 0 && balanced == 0) break;
            if (balanced > 0) return false;
        }

        if (open > 0) {
            return false;
        }


        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return true;
    }
}

// More space
class Solution {
    public boolean canBeValid(String s, String locked) {
        int n = s.length();
        if (n % 2 != 0) return false; // odd len

        // iterate thru s chars
        // 2 stacks for open and unlocked indices
        // if unlocked add to unlocked stack
        // else if locked but open add to open
        // else if locked but closed
            // check if open not empty pop index
            // check if unlocked not empty pop index
            // if both are then return false
        // handles all locked closed
        
        // if surplus of open paren
        // while open stack not empty 
            // if unlocked not empty and open.peek < unlocked.peek
            // else return false
        Stack<Integer> open = new Stack<>();
        Stack<Integer> unlocked = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (locked.charAt(i) == '0') {
                unlocked.push(i);
            } else if (s.charAt(i) == '(') {
                open.push(i);
            } else if (s.charAt(i) == ')') {
                if (!open.isEmpty()) {
                    open.pop();
                } else if (!unlocked.isEmpty()) {
                    unlocked.pop();
                } else {
                    return false;
                }
            }
        }

        while (!open.isEmpty()) {
            if (!unlocked.isEmpty() && open.peek() < unlocked.peek()) {
                open.pop();
                unlocked.pop();
            } else {
                return false;
            }
        }

        return true;
    }
}
