class Solution {
    public int[] prisonAfterNDays(int[] cells, int n) {
        if (cells == null || n == 0) return cells;
        
        HashSet<String> seen = new HashSet<>();
        boolean cyclic = false;
        int cyclicCount = 0;

        for (int i = 0; i < n; i++) {
            int[] temp = new int[8];
            temp[0] = 0;
            temp[7] = 0;

            for (int c = 1; c < 7; c++) {
                if (cells[c-1] == cells[c+1]) {
                    temp[c] = 1;
                } else {
                    temp[c] = 0;
                }
            }

            String arr = Arrays.toString(temp);
            if (seen.contains(arr)) {
                cyclic = true;
                break;
            } else {
                seen.add(arr);
                cyclicCount++;
            }
            
            cells = temp;
        }

        if (cyclic) {
            // This will get us the correct amount.
            int N = n % cyclicCount;
            for (int i = 0; i < N; i++) {
                int[] temp = new int[8];
                temp[0] = 0;
                temp[7] = 0;

                for (int c = 1; c < 7; c++) {
                    if (cells[c-1] == cells[c+1]) {
                        temp[c] = 1;
                    } else {
                        temp[c] = 0;
                    }
                }

                cells = temp;
            }
        }

        // Reason: There are 8 cells, and 2 possible states for each cell, so 2^8 = 64 possible states for N day iterations, basically O(1) for space or O(min(n,64)) for time.
        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return cells;
    }
}
