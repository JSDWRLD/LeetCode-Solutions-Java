class Solution {
    public int lengthOfLastWord(String s) {

        // index but start at end of string until you hit a space
        // return count

        int result = 0;

        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) != ' '){
                result++;
            } else {
                if(result > 0){
                    return result;
                }
            }
        }
        
        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return result; 
    }
}