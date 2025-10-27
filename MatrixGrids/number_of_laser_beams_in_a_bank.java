class Solution {
    public int numberOfBeams(String[] bank) {
        int n = bank.length, prev = 0;
        int beams = 0;
        for (int i = 0; i < n; i++) {
            int lasers = count(bank[i]);
            // anytime nonempty we just multiply with prev
            // if 0 we skip till next nonempty
            if (lasers > 0) {
                beams += prev * lasers;
                prev = lasers;
            }
        }

        // Time: O(n*m)
        // Space: O(1)
        return beams;
    } 

    private int count(String s) {
        int ones = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') ones++;
        }

        return ones;
    }
}

