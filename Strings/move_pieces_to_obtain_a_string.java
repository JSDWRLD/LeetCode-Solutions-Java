class Solution {
    public boolean canChange(String start, String target) {
        int startIndex = 0, targetIndex = 0, startLen = start.length(), targetLen = target.length();

        while (startIndex < startLen || targetIndex < targetLen) {
            while (startIndex < startLen && start.charAt(startIndex) == '_') startIndex++;
            while (targetIndex < targetLen && target.charAt(targetIndex) == '_') targetIndex++;

            // Both should be at the end if one reaches the end
            if (startIndex == startLen || targetIndex == targetLen) return startIndex == targetIndex;

        
            if (start.charAt(startIndex) != target.charAt(targetIndex)) return false;
            if (start.charAt(startIndex) == 'L' && startIndex < targetIndex)  return false;
            if (start.charAt(startIndex) == 'R' && startIndex > targetIndex)  return false;
            startIndex++;
            targetIndex++;
        }

        // Worst case both strings are long as possible, they're the same length
        // which is N, each char is procesed at most once.
        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return true;
    }
}

//_L__R__R_
//L______RR
// Index of target has the be less than start for L
// Vice versa for R
