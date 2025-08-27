class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int n = distance.length;

        int cwDist = 0;
        for (int i = start; i != destination; i = (i + 1) % n) {
            cwDist += distance[i];
        }

        int ccwDist = 0;
        for (int i = destination; i != start; i = (i + 1) % n) {
            ccwDist += distance[i];
        }

        // Time Complexity: O(n)
        // Space Complexity: O(1)
        return cwDist < ccwDist ? cwDist : ccwDist;
    }
}
