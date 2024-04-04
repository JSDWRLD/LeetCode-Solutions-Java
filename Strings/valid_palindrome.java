class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() == 0) return true;

        // Setup Pointers
        int start = 0;
        int end = s.length() - 1;

        while(start <= end){
            char startC = s.charAt(start);
            char endC = s.charAt(end);
            if(!Character.isLetterOrDigit(startC)){
                // move start pointer
                start++;
            } else if (!Character.isLetterOrDigit(endC)){
                // move end pointer
                end--;
            } else {
                // else they are both characters
                if(Character.toLowerCase(startC) != Character.toLowerCase(endC)){
                    return false;
                }

                // Collapse pointers
                start++;
                end--;
            }
        }

        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return true;
    }
}
