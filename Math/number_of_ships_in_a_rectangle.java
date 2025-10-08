/**
 * // This is Sea's API interface.
 * // You should not implement it, or speculate about its implementation
 * class Sea {
 *     public boolean hasShips(int[] topRight, int[] bottomLeft);
 * }
 */

class Solution {
    public int countShips(Sea sea, int[] topRight, int[] botLeft) {

        int x1 = botLeft[0], x2 = topRight[0];
        int y1 = botLeft[1], y2 = topRight[1];
        // invalid box
        if (x1 > x2 || y1 > y2) return 0;

        // O(1)
        if (!sea.hasShips(topRight, botLeft)) return 0;

        // Converged to a single point + 1 ship
        if (x1 == x2 && y1 == y2) return 1;
 
        int midX = (x1 + x2) / 2;
        int midY = (y1 + y2) / 2;
        
        // S: Ships
        // M: possible x coords
        // N: possible y coords
        // D: recursion depth for 1 call = log (max(m,n))
        // Time: O(S * D), S ships go down D levels, empty quadrants return immediately
        // Space: O(D), recursion stack
        return
            // box 1: bottom left
            countShips(sea, new int[] {midX, midY}, botLeft) +
            // box 2: bottom right
            countShips(sea, new int[] {x2, midY}, new int[] {midX+1, y1}) +
            // box 3: top left
            countShips(sea, new int[] {midX, y2}, new int[] {x1, midY+1}) +
            // box 4: top right
            countShips(sea, topRight, new int[] {midX+1, midY+1});
    }
}
