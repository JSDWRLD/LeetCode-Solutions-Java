class Solution {
    public int balancedStringSplit(String s) {
        int total = 0;
        int counter = 0;
        
        for (char c : s.toCharArray()) {
            if (c == 'R') counter++;
            else if (c == 'L') counter--;
            
            if (counter == 0) total++;
        }
        
        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return total;
    }
}
