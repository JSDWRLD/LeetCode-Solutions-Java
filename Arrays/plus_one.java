class Solution {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length - 1; i >= 0; i--){
            if(digits[i] < 9){
                // if the current end digit is less than 9
                // we simply increment and return
                digits[i]++;
                return digits;
            }
            
            // else the current digit is 9 and we keep updating its value to 0 
            digits[i] = 0;
        }

        // Safety, if the loop finishes without exiting we create an extra index for the array
        // and set its first index to 1
        digits = new int[digits.length + 1];
        digits[0] = 1;

        // Speed: 0ms
        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return digits;
    }
}

