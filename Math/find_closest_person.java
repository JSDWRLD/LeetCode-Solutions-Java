class Solution {
    public int findClosest(int x, int y, int z) {
        int diff2 = Math.abs(z-y);
        int diff1 = Math.abs(z-x);

        // Time Complexity: O(1)
        // Space Complexity: O(1)
        if (diff1 == diff2) return 0;
        else if (diff1 < diff2) return 1;
        else return 2;
    }
}
