class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        
        // each index is a certain char, 0 = a
        int[] s1Freq = new int[26];
        int winSize = s1.length();

        // prep window which is same length as s1
        for(int i = 0; i < winSize; i++){
            // add at ascii index for char
            s1Freq[s1.charAt(i) - 'a'] += 1;
            // minus if s2 contains the same char, 
            s1Freq[s2.charAt(i) - 'a'] -= 1;
        }
        
        // check initial window
        if(checkFreq(s1Freq)) return true;

        // loop through rest of the characters in s2 and compare at each window
        for(int i = 0; i < s2.length() - winSize; i++){ 
            // update our window and freq map
            // first operation is to remove the first char in
            s1Freq[s2.charAt(i) - 'a'] += 1;
            s1Freq[s2.charAt(i+winSize) - 'a'] -= 1;
            
            // checks our window each time
            if(checkFreq(s1Freq)) return true;
        }
        
        // at end of loop we still have to check the last window
        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return checkFreq(s1Freq);
    }

    // This method is always O(26)
    public boolean checkFreq(int[] freq){
        for(int i : freq){
            if(i != 0) return false;
        }
        // true if we iterate through entire freq map and there are no ones, meaning
        // s2 successfully removed all the 1s added by s1
        return true;
    }
}
