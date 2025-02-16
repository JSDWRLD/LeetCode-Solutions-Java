class Solution {
    public int[] constructDistancedSequence(int n) {
        // We have two numbers from 2 -n and one 1
        int[] sequence = new int[2*n - 1];
        boolean[] isUsed = new boolean[n+1];

        // Pass by reference
        findValidSequence(sequence, isUsed, 0, n);

        // Time Complexity: O(n!)
        // Space Complexity: O(n)
        return sequence;
    }

    private boolean findValidSequence(
        int[] sequence, 
        boolean[] isUsed,
        int index,
        int targetNum
    ) {
        // we have reached the end of a valid sequence
        if (index == sequence.length) return true;

        // continue to the next index and place something
        if (sequence[index] != 0) {
            return findValidSequence(sequence, isUsed, index+1, targetNum);
        }

        // Process from largest to 1
        for (int curr = targetNum; curr >= 1; curr--) {
            if (isUsed[curr]) continue;

            // Place current number not used
            sequence[index] = curr;
            isUsed[curr] = true;

            // Goto the next index
            if (curr == 1 && findValidSequence(sequence, isUsed, index+1, targetNum)) {
                // No need to place a second 1 anywhere
                return true;
            }

            int distPlacement = curr + index;
            if (distPlacement < sequence.length && sequence[distPlacement] == 0) {
                // place the curr number at its valid area 
                sequence[distPlacement] = curr;

                // Continue trying to fill sequence to 2n - 1 length
                if (findValidSequence(sequence, isUsed, index+1, targetNum)) {
                    return true;
                }

                // If the path we took is wrong backtrack out
                sequence[distPlacement] = 0;
            }

            // Backtrack
            sequence[index] = 0;
            isUsed[curr] = false;
        }

        return false;
    }   
}
