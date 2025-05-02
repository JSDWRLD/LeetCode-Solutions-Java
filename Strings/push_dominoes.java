class Solution {
    public String pushDominoes(String dominoes) {
        // 3 Cases
        // same -> all same until curr pointer
        // LR borders -> still dominoes in middle
        // RL borders -> still mid if odd

        // Fence post edges with L and R because it wont make a difference
        dominoes = "L" + dominoes + "R";
        StringBuilder result = new StringBuilder();

        int prev = 0;
        for (int curr = 1; curr < dominoes.length(); curr++) {
            char prevC = dominoes.charAt(prev);
            char currC = dominoes.charAt(curr);
            // Skip iteration and keep expanding our window
            if (currC == '.') continue;

            if (prev > 0) result.append(prevC);
            // We -1 because we always append prev above
            int lenWindow = curr - prev - 1;
            // The cases below depend on the fence posts of the window
            if (prevC == currC) {
                for (int i = 0; i < lenWindow; i++) {
                    result.append(prevC);
                }
            } 
            else if (prevC == 'L' && currC == 'R') {
                // Append still dominos in the middle
                // R will get appended at next iteration
                for (int i = 0; i < lenWindow; i++) {
                    result.append('.');
                }
            } 
            else {
                // Add left side
                for (int i = 0; i < lenWindow/2; i++) {
                    result.append('R');
                }

                // Add still domino if its not even,
                if (lenWindow % 2 != 0) result.append('.');

                // Add right side
                for (int i = 0; i < lenWindow/2; i++) {
                    result.append('L');
                }
            }

            // Update pointer
            prev = curr;
        }

        // Time Complexity: O(n)
        // Space Complexity: O(n)
        return result.toString();
    }
}
