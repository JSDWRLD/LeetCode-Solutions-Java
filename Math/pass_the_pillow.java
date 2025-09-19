class Solution {
    public int passThePillow(int n, int time) {
        int loops = time / (n-1);
        int endMoves = time % (n-1); // Remainder, moves after the loop
        // if even amount of end to end loops, then we start from 1
        // else odd, then we start from n
        
        // Time Complexity: O(1)
        // Space Complexity: O(1)
        return loops % 2 == 0 ? endMoves+1 : n-endMoves;
    }
}
