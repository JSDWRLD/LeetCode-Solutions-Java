class Solution {
    private Map<Character, String> map = Map.of(
        '2', "abc",
        '3', "def",
        '4', "ghi",
        '5', "jkl",
        '6', "mno",
        '7', "pqrs",
        '8', "tuv", 
        '9', "wxyz"
    );

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) 
            return new ArrayList<>();

        List<String> res = new ArrayList<>();
        String current = "";
        backtracking(digits, res, current, 0);

        // Time Complexity: O(n * 4^n)
        // Space Complexity: O(n)
        return res;
    }

    private void backtracking(String digits, List<String> res, String current, int i) {
        
        if (current.length() == digits.length()) {
            res.add(current); // Base Case 1
        } else if (i >= digits.length()) {
            return; // Base Case 2
        } else {
            // Backtracking Decision Making
            String numPadChars = map.get(digits.charAt(i));
            for (char c: numPadChars.toCharArray()) 
                backtracking(digits, res, current+c, i+1);
        }
    }
}
