class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> result = new LinkedList<>();
        Queue<String> perms = new LinkedList<>();
        perms.add(""); 

        
        for (char c : s.toCharArray()) {
            int size = perms.size();

            for (int i = 0; i < size; i++) {
                String curr = perms.remove(); 

                if (!Character.isDigit(c)) {
                    // letter
                    String tempUpper = curr;
                    String tempLower = curr;

                    String conv = Character.toString(Character.toUpperCase(c));
                    String conv2 = Character.toString(Character.toLowerCase(c));
                    tempUpper += conv;
                    tempLower += conv2;

                    perms.add(tempUpper);
                    perms.add(tempLower);
                } else {
                    // number
                    String temp = curr;
                    temp += Character.toString(c);
                    perms.add(temp);
                }
            }
        }

        while (!perms.isEmpty()) {
            result.add(perms.remove());
        }

        // Time Complexity: O(2^n)
        // Space Complexity: O(2^n)
        return result;
    }
}
