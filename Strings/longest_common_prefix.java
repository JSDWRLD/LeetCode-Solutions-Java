class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];
        int idx = 0;

        // while loop o(n) very small though
        while(idx < Math.min(first.length(),last.length())){
            // if the characters are equal we upcount the index
            // the reason for that is so we can access the string
            if(first.charAt(idx) == last.charAt(idx)){
                idx++;
            } else {
                // break out of the loop not method
                break;
            }
        }

        // returns the first word from index of 0 to index
        // Time Complexity: O( n * log n)
        // Space Complexity: O(1)
        return first.substring(0, idx); 
    }
}
