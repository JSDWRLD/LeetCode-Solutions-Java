class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        if(len <= 1) return len;

        Set<Character> seen = new HashSet<>();
        int max = 0;
        int left = 0;
        int right = 0;

        while(right < len) {
            char rightC = s.charAt(right);
            
            while(seen.contains(rightC)){
                // slide our window to contain only non duplicates
                seen.remove(s.charAt(left));
                left++;
            }
            
            // we add into set, and update our max
            seen.add(rightC);
            max = Math.max(max, right - left + 1);
            right++;
        }

        // Time Complexity: O(n)
        // Space Complexity: O(m)
        return max;
    }
}
