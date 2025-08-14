class Solution {
    public String largestGoodInteger(String num) {
        // win size = 3
        StringBuilder sb = new StringBuilder();
        sb.append(num.charAt(0));
        char prev = num.charAt(0);

        int max = -1;
        for (int i = 1; i < num.length(); i++) {
            char curr = num.charAt(i);
            if (curr == prev) {
                sb.append(curr);
            }
            else {
                sb.append(curr);
                while (sb.charAt(0) != curr) {
                    sb.deleteCharAt(0);
                }
                prev = curr;
            }
            
            if (sb.length() == 3) {
                max = Math.max(Integer.valueOf(sb.charAt(0)) - '0', max);
            }
        }
        
        if (max == -1) return "";

        String c = Integer.toString(max);

        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return c + c + c;
    }
}
