class Solution {
    public int firstUniqChar(String s) {
        if(s.length() == 1) {
            return 0;
        }
    
        int[] charFreq = new int[26];

        for (char c : s.toCharArray()) 
            charFreq[c - 'a']++;
        
        for (char c : s.toCharArray()) 
            if (charFreq[c - 'a'] == 1) 
                return s.indexOf(c);
        
        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return -1;
    }
}
