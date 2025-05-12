class Solution {
    public int[] findEvenNumbers(int[] digits) {

        // 9 possible digits
        int[] freq = new int[10]; // O(n)
        for (int n : digits) {
            freq[n]++;
        }

        ArrayList<Integer> result = new ArrayList<>();
        // Work with each digit O(450), 900/2,
        // this is already sorted since we start with the first number
        // No matter what a and b are, the evenness is dictated by c loop
        for (int a = 1; a < 10; a++) { 
            if (freq[a] == 0) continue;
            freq[a]--; // Consume digit freq, so we dont use on next loop

            for (int b = 0; b < 10; b++) {
                if (freq[b] == 0) continue;
                freq[b]--; // Consume digit freq, so we dont use on next loop
                
                // Only evens
                for (int c = 0; c < 10; c+= 2) {
                    if (freq[c] > 0) result.add(a*100+ b*10 + c);
                }

                freq[b]++; // Add back for next iteration
            }

            freq[a]++; // Add back for next iteration
        }

        int[] ans = new int[result.size()];
        for (int i = 0; i < result.size(); i++) ans[i] = result.get(i);

        // Time Complexity: O(n)
        // Space Complexity: O(1) if you dont count aux for answer
        return ans;
    }
}
