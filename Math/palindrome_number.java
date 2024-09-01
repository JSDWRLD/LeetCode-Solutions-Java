class Solution {
    public boolean isPalindrome(int x) {
        // If x is negative or is a multiple of 10 we return false
        // Multiples of 10 cannot be a palindrome
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;
        
        int reverse = 0;
        // Reversing numbers until middle point
        while (x > reverse) {
            reverse = reverse * 10 + (x % 10);
            x /= 10;
        }

        // 1st case is for even length and second is for odd
        // Time Complexity: O(log n)
        // Space Complexity: O(1)
        return reverse == x || x == reverse/10;
    }
}
