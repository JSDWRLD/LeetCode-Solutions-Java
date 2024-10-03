class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();

        int endA = a.length()-1, endB = b.length()-1;
        int carry = 0;
        while (endA >= 0 || endB >= 0 || carry == 1) {

            if (endA >= 0) {
                carry += a.charAt(endA) - '0';
                endA -= 1;
            } 
            if (endB >= 0) {
                carry += b.charAt(endB) - '0';
                endB -= 1;
            } 

            sb.append(carry % 2);
            carry /= 2;
            // If 1 + 1, carry will still be 1 and append will append 0
        }

        // based on whether or not a or b is longest
        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return sb.reverse().toString();
    }

}
