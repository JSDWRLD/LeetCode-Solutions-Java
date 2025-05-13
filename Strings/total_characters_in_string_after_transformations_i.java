class Solution {
    public int lengthAfterTransformations(String s, int t) {
        int mod = (int)Math.pow(10,9) + 7;
        
        // Count frequency of each character
        int[] currState = new int[26];
        for (char c : s.toCharArray()) {
            currState[c-'a']++;
        }

        // Iterate until t transforms are done
        // Modify the frequency array
        for (int i = 0; i < t; i++) {
            int[] nextState = new int[26];
            // Z's will be add 1 to freq of a and b since z->ab
            // all currState 'a' frequencies will turn to b's a->b
            nextState[0] = currState[25];
            nextState[1] = (currState[25] + currState[0]) % mod;

            // Update the remaining frequencies to the next state
            for (int j = 2; j < 26; j++) {
                nextState[j] = currState[j-1];
            }

            // Update our current state
            currState = nextState;
        }

        int result = 0;
        for (int freq : currState) 
            result = (result + freq) % mod;

        // Size of alphabet = 26, let it be k
        // Time Complexity: O(n + t*k)
        // Space Complexity: O(k)
        return result;
    }
}
