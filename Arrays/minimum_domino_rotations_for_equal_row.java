class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        // An important observation is that
        // the answer will always be the minimum of the rotations
        // required for the element 0th index of the top or bottom
        // Its not about the rows themselves, its about whether
        // or not the bottom or the top have the min number.
        // Whichever number it is, it will always exist n times
        // because we have to make them all the same.

        // If all the numbers during the check = A[0] then its possible
        // to make all the same, else we get -1
        int rotations = checkValidNumber(tops, bottoms, tops[0]);

        // If rotations == -1 or theyre both the same then 
        // we dont need to check Bottoms[0]
        if (rotations != -1 || tops[0] == bottoms[0]) return rotations;

        // Finally check if we wanted to flip all numbers to
        // bottom tile first number is it possible
        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return checkValidNumber(tops, bottoms, bottoms[0]);
    }

    // Returns the min number of which side has the most rotations needed
    // a rotation is incremented if the index is not == to the passed in curr
    private int checkValidNumber(int[] tops, int[] bottoms, int curr) {
        int rotTop = 0, rotBot = 0;
        for (int i = 0; i < tops.length; i++) {
            // Impossible to make all the same if both
            // top and bottom dont equal the number passed in
            if (tops[i] != curr && bottoms[i] != curr) return -1;

            if (tops[i] != curr) rotTop++;
            else if (bottoms[i] != curr) rotBot++;
        }

        return Math.min(rotTop, rotBot);
    }
}
